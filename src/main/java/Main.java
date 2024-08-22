import ball.Ball;
import ball.MovableBall;
import ball.PaintableBall;
import world.MovableWorld;
import world.World;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JFrame {

    static final int FRAME_WIDTH = 500;
    static final int FRAME_HEIGHT = 400;
    static final int BALL_COUNT = 10;
    static final Color[] colors = {Color.BLUE, Color.RED, Color.WHITE, Color.YELLOW, Color.GREEN};
    static final Random random = new Random();

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("벽돌 깨기!!!");
        MovableWorld world = new MovableWorld();

        jFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        jFrame.add(world);

        jFrame.setVisible(true);    // 해당 함수를 호출하기 전에 프레임에 world를 넣어야 width,height가 적용됨

        while (world.getBallCount() < BALL_COUNT) {
            try {
                MovableBall ball = new MovableBall(
                        random.nextInt(FRAME_WIDTH),
                        random.nextInt(FRAME_HEIGHT),
                        random.nextInt(50)+10,
                        colors[random.nextInt(colors.length)]
                );

                ball.setDX((random.nextInt() < 0) ? -(random.nextInt(5) + 1) : (random.nextInt(5) + 1));
                ball.setDY((random.nextInt() < 0) ? -(random.nextInt(5) + 1) : (random.nextInt(5) + 1));

                world.add(ball);
            } catch (IllegalStateException e) {
                System.err.println(e.getMessage());
            }

        }

        world.repaint();
        world.run();
    }
}
