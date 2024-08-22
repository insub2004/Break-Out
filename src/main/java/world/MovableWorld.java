package world;

import ball.Ball;
import ball.MovableBall;

public class MovableWorld extends World{
    private static final int DEFAULT_DT = 100;
    private int moveCount;
    private int limitedMaxMoveCount;
    private int dt;

    public MovableWorld() {
        this(DEFAULT_DT);
    }

    public MovableWorld(int dt) {
        super();
        this.dt = dt;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public int getLimitedMaxMoveCount() {
        return limitedMaxMoveCount;
    }

    public void setLimitedMaxMoveCount(int limitedMaxMoveCount) {
        this.limitedMaxMoveCount = limitedMaxMoveCount;
    }

    public int getDT() {
        return dt;
    }

    public void setDT(int dt) {
        this.dt = dt;
    }

    public void reset() {
        moveCount = 0;
    }

    public void move() {
        for (int i = 0; i < getBallCount(); i++) {
            Ball ball = getBall(i);

            if (ball instanceof MovableBall) {
                ((MovableBall) ball).move();
            }
        }
        moveCount++;
        repaint();
    }

    public void run() {
        while((limitedMaxMoveCount == 0) || (moveCount == limitedMaxMoveCount)) {
            move();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
