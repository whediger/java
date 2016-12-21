
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
  <applet code="CheckboxDemo" height="200" width="240"></applet>
*/


public class CheckboxDemo extends Applet implements ItemListener {
  String msg = "";
  Checkbox windows, andriod, solaris, mac;

  public void init(){
    windows = new Checkbox("Windows", null, true);
    andriod = new Checkbox("Andriod");
    solaris = new Checkbox("Solaris");
    mac = new Checkbox("Mac OS");

    add(windows);
    add(andriod);
    add(solaris);
    add(mac);

    windows.addItemListener(this);
    andriod.addItemListener(this);
    solaris.addItemListener(this);
    mac.addItemListener(this);
  }

  @Override
  public void itemStateChanged(ItemEvent ie){
    repaint();
  }

  //display current state of checkboxes
  public void paint(Graphics g){
    msg = "Current state: ";
    g.drawString(msg, 6, 80);
    msg = " Windows: " + windows.getState();
    g.drawString(msg, 6, 100);
    msg = " Andriod: " + andriod.getState();
    g.drawString(msg, 6, 120);
    msg = " Solaris: " + solaris.getState();
    g.drawString(msg, 6, 140);
    msg = " Mac: " + mac.getState();
    g.drawString(msg, 6, 160);
  }
}
