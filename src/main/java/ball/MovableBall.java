package ball;

import java.awt.*;

public class MovableBall extends PaintableBall {

    private int dx;
    private int dy;

    public MovableBall(int x, int y, int radius) {
        super(x,y,radius);
    }

    public MovableBall(int x, int y, int radius, Color color) {
        super(x,y,radius,color);
    }

    public int getDX() {
        return dx;
    }

    public int getDY() {
        return dy;
    }

    public void setDX(int dx) {
        this.dx = dx;
    }

    public void setDY(int dy) {
        this.dy = dy;
    }


    public void move() {
        moveTo(getX()+dx, getY()+dy);
    }

    public void moveTo(int x, int y) {
        setX(x);
        setY(y);
    }

}
