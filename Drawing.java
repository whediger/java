import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JFrame;


public class Drawing extends Canvas {

  public void paint(Graphics g) {
    Color myBlue = new Color(0,162,232);
    g.setColor(Color.blue);
    g.fillOval(100, 100, 200, 200);

  }
  public void boxOval(Graphics g, Rectangle bb){
    g.fillOval(bb.x, bb.y, bb.width, bb.height);
  }

  public void micky(Graphics g, Rectangle bb){
    boxOval(g, bb);

    int dx = bb.width / 2;
    int dy = bb.height / 2;
    Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);

    half.translate(-dx / 2, -dy / 2);
    boxOval(g, half);

    half.translate(dx * 2, 0);
    boxOval(g, half);
  }

  //  +==]========>
  public static void main(String[] args){
    JFrame frame = new JFrame("my drawing");
    Canvas canvas = new Drawing();
    canvas.setSize(400, 400);
    canvas.setBackground(Color.darkGray);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
  }
}
