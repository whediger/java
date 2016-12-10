
package snake;

import java.awt.*;
import java.awt.Canvas;
import javax.swing.JFrame;
import java.util.Random;

public class Snake extends Canvas{

  static final int FRAME_HEIGHT = 500;
  static final int FRAME_WIDTH = 500;

  public static void main(String args[])
  {
    JFrame f = new JFrame("Snake Game");
    Canvas c = new Canvas();
    f.setSize(FRAME_HEIGHT, FRAME_WIDTH);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    c.setSize(FRAME_HEIGHT, FRAME_WIDTH);
    c.setBackground(Color.GREEN);

    f.add(c);
    f.setVisible(true);
    drawCircle();
  }

  public static void drawCircle() {
    Random rand = new Random();
    int y = rand.nextInt(FRAME_HEIGHT);
    int x = rand.nextInt(FRAME_WIDTH);
    System.out.println("x: " + x + " y: " + y);
  }

}
