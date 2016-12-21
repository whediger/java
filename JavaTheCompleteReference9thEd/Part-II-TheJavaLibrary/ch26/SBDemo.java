
import java.awt.*;
import java.awt.event.*;
import java.awt.Scrollbar.*;
import java.applet.*;

/*
  <applet code="SBDemo" height="200" width="300"></applet>
*/

public class SBDemo extends Applet implements AdjustmentListener, MouseListener
{
    String msg = "";
    Scrollbar vertSB, horzSB;

    public void init(){
      int width = Integer.parseInt(getParameter("width"));
      int height = Integer.parseInt(getParameter("height"));

      vertSB = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, height);
      vertSB.setPreferredSize(new Dimension(20, 100));

      horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, width);
      horzSB.setPreferredSize(new Dimension(100, 20));

      add(vertSB);
      add(horzSB);

      vertSB.addAdjustmentListener(this);
      horzSB.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae) {
      repaint();
    }


    public void mouseDragged(MouseEvent me) {
      int x = me.getX();
      int y = me.getY();

      vertSB.setValue(y);
      horzSB.setValue(x);

      repaint();
    }

    @Override
    public void mouseExited(MouseEvent me){}

    @Override
    public void mouseEntered(MouseEvent me){}

    @Override
    public void mouseReleased(MouseEvent me){}

    @Override
    public void mousePressed(MouseEvent me){}

    @Override
    public void mouseClicked(MouseEvent me){}

    public void paint(Graphics g) {
      msg = "Vertical: " + vertSB.getValue();
      msg += ", Horizontal: " + horzSB.getValue();
      g.drawString(msg, 6, 160);

      //show current mouse drag position
      g.drawString("*", horzSB.getValue(), vertSB.getValue());
    }
}
