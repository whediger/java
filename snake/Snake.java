
package snake;

import java.awt.*;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.Random;

public class Snake extends Canvas{

  static final int FRAME_HEIGHT = 500;
  static final int FRAME_WIDTH = 500;

  public int appleX;
  public int appleY;

  JFrame f;
  Canvas c;

  public void startGame(){
    JFrame f = new JFrame("Snake Game");
    Canvas c = new Snake();

    f.setSize(FRAME_HEIGHT, FRAME_WIDTH);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    c.setSize(FRAME_HEIGHT, FRAME_WIDTH);
    c.setBackground(Color.GREEN);

    //cir
    Canvas cir = new Snake();
    cir.setSize(10,10);

    Random rand = new Random();
    int y = rand.nextInt(FRAME_HEIGHT - 20) + 20;
    int x = rand.nextInt(FRAME_WIDTH - 20) + 20;
    cir.setLocation(x, y);
    cir.setBackground(Color.RED);

    f.add(cir);

    //+==]========>

    f.add(c);
    drawCircle();
    f.setVisible(true);

  }

  public static void main(String args[])
  {
    Snake s = new Snake();
    s.startGame();

  }

  public static void drawCircle() {

    System.out.println("x: " + "x" + " y: " + "y");
  }

}
