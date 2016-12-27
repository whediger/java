
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;

public class Colors extends Canvas implements Serializable {
  transient private Color color; //not persistant
  private boolean rectangular; //is persistant

  public void colors(){
    addMouseListener(new MouseAdapter(){
      @Override
      public void mousePressed(MouseEvent me){
        change();
      }
    });

    rectangular = false;
    setSize(200, 200);
    change();
  }

  public boolean getRectangular(){
    return rectangular;
  }

  public void setRectangular(boolean r){
    rectangular = r;
  }

  public void change(){
    color = randomColor();
    repaint();
  }

  private Color randomColor(){
    int r = (int)(255*Math.random());
    int g = (int)(255*Math.random());
    int b = (int)(255*Math.random());
    return new Color(r, g, b);
  }

  @Override
  public void paint(Graphics g){
    Dimension d = getSize();
    int h = d.height;
    int w = d.width;
    g.setColor(color);
    if(rectangular)
      g.fillRect(0, 0, w-1, h-1);
    else g.fillOval(0, 0, w-1, h-1);
  }
}
