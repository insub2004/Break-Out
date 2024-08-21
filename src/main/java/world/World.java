package world;

import ball.Ball;
import ball.PaintableBall;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class World extends JPanel {

    private final List<Ball> ballList;

    public World() {
        super();
        ballList = new ArrayList<>();
    }

    public void add(Ball ball) {
        if (Objects.isNull(ball)) {
            throw new IllegalArgumentException("null을 추가할 수 없습니다.");
        }

        if ((ball.getX() - ball.getRadius() < 0) ||
                (ball.getY() - ball.getRadius() < 0) ||
                (ball.getX() + ball.getRadius()) > getWidth() ||
                (ball.getY() + ball.getRadius()) > getHeight()) {
            System.out.println(getWidth());
            System.out.println(getHeight());
            throw new IllegalStateException("원의 완전한 모양이 World의 경계 안쪽에서만 생성될 수 있습니다.");
        }

        ballList.add(ball);
    }

    public void remove(Ball ball) {
        if (Objects.isNull(ball)) {
            throw new IllegalArgumentException("null을 삭제할 수 없습니다.");
        }

        ballList.remove(ball);
    }

    public int getCount() {
        return ballList.size();
    }

    public Ball getBall(int index) {
        return ballList.get(index);
    }

    @Override
    public void paint(Graphics g) {
        for(Ball ball : ballList) {
            if (ball instanceof PaintableBall) {
                ((PaintableBall) ball).paint(g);
            }
        }
    }

}
