
package snake;

import java.awt.*;
import java.awt.Canvas;
import javax.swing.JFrame;

public class Snake extends Canvas{

  public static void main(String args[])
  {
    JFrame f = new JFrame("Snake Game");
    Canvas c = new Canvas();
    f.setSize(300, 300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    c.setSize(300, 300);
    c.setBackground(Color.GREEN);
    f.add(c);
    f.setVisible(true);


  }

}
