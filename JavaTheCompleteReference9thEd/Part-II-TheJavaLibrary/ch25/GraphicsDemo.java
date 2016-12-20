
import java.awt.*;
import java.applet.*;

/*

  <applet code="GraphicsDemo" height=700 width=350></applet>

*/

public class GraphicsDemo extends Applet {
  public void paint(Graphics g){

    //draw lines
    g.drawLine(0, 0, 100, 90);
    g.drawLine(0, 90, 100, 10);
    g.drawLine(40, 25, 250, 80);

    //draw rectangles
    g.drawRect(10, 150, 60, 50);
    g.fillRect(100, 150, 60, 50);
    g.drawRoundRect(190, 150, 60, 50, 15, 15);
    g.fillRoundRect(280, 150, 60, 50, 30, 40);

    //draw ellipsis and circles
    g.drawOval(10, 250, 50, 50);
    g.fillOval(90, 250, 75, 50);
    g.drawOval(190, 260, 100, 40);

    //draw arcs
    g.drawArc(10, 350, 70, 70, 9, 180);
    g.fillArc(60, 350, 70, 70, 0, 75);

    //draw polygon
    int xpoints[] = { 10, 200, 10, 200, 10 };
    int ypoints[] = { 450, 450, 650, 650, 450 };
    int num = 5;

    g.drawPolygon(xpoints, ypoints, num);
  }
}
