import ball.Ball;
import ball.PaintableBall;
import world.World;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    static final int FRAME_WIDTH = 500;
    static final int FRAME_HEIGHT = 400;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("벽돌 깨기!!!");
        World world = new World();

        jFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        jFrame.add(world);

        jFrame.setVisible(true);    // 해당 함수를 호출하기 전에 프레임에 world를 넣어야 width,height가 적용됨

        PaintableBall ball = new PaintableBall(FRAME_WIDTH/2,FRAME_HEIGHT/2,100, Color.GREEN);
        world.add(ball);

    }
}
