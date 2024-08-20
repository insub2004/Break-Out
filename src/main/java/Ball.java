public class Ball {

    private int x;
    private int y;
    private int radius;

    public Ball(int x, int y, int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("반지름은 음수가 될 수 없습니다.");
        }

        if (((long) x + radius > Integer.MAX_VALUE) ||
                ((long) x - radius < Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("볼의 영역이 X축의 허용 범위를 벗어납니다.");
        }
        if (((long) y + radius > Integer.MAX_VALUE) ||
                ((long) y - radius < Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("볼의 영역이 Y축의 허용 범위를 벗어납니다.");
        }

        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("(").append(x)
                .append(",").append(y)
                .append(",").append(radius)
                .append(")");

        return sb.toString();
    }
}
