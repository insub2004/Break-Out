package ball;

import java.awt.*;

public class PaintableBall extends Ball {

    public static final Color DEFAULT_COLOR = Color.BLACK;
    Color color;

    public PaintableBall(int x, int y, int radius) {
        this(x,y,radius,DEFAULT_COLOR);
    }

    public PaintableBall(int x, int y, int radius, Color color) {
        super(x, y, radius);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(getX()-getRadius(),getY()-getRadius(),getRadius()*2,getRadius()*2);
    }

}
