import ball.Ball;
import ball.PaintableBall;

import javax.swing.*;

public class Main extends JFrame {

    static final int FRAME_WIDTH = 500;
    static final int FRAME_HEIGHT = 400;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("벽돌 깨기!!!");
        jFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setResizable(true);
        jFrame.setVisible(true);

        JPanel jPanel = new JPanel();

        PaintableBall ball = new PaintableBall(10,10,10);
    }
}
