import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JFrame;


public class Drawing extends Canvas {

  public void paint(Graphics g) {
    Color myBlue = new Color(0,162,232);
    g.setColor(Color.red);
    g.fillOval(200, 100, 200, 200);

  }

  //  +==]========>
  public static void main(String[] args){
    JFrame frame = new JFrame("my drawing");
    Canvas canvas = new Drawing();
    canvas.setSize(600, 400);
    canvas.setBackground(Color.white);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
  }
}
