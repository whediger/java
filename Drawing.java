import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;


public class Drawing extends Canvas {

  public static void main(String[] args){
    JFrame frame = new JFrame("my drawing");
    Canvas canvas = new Drawing();
    canvas.setSize(400, 400);
    canvas.setBackground(Color.darkGray);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
  }

  public void paint(Graphics g) {
    Color myBlue = new Color(0,162,232);
    g.setColor(Color.blue);
    g.fillOval(100, 100, 200, 200);

  }
}
