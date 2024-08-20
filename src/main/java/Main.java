public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = -1;
        int radius = Integer.MAX_VALUE;

        Ball ball = new Ball(x, y, radius);

        if ((x != ball.getX()) || (y != ball.getY()) || (radius != ball.getRadius())) {
            System.out.println("Ball 구현이 잘못되었습니다.");
        } else {
            System.out.println("Ball이 생성되었습니다 : " + ball);
        }
    }
}
