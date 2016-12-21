
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
  <applet code="ChoiceDemo" height="180" width="300"></applet>
*/

public class ChoiceDemo extends Applet implements ItemListener {
  Choice os, browser;
  String msg = "";

  public void init(){
    os = new Choice();
    browser = new Choice();

    os.add("Windows");
    os.add("Ubuntu");
    os.add("UNIX");
    os.add("Mac OS");

    browser.add("Internet Exploder");
    browser.add("Fire Fox");
    browser.add("Chrome");

    add(os);
    add(browser);

    os.addItemListener(this);
    browser.addItemListener(this);
  }

  @Override
  public void itemStateChanged(ItemEvent ie){
    repaint();
  }

  public void paint(Graphics g){
    msg = "Current OS: ";
    msg += os.getSelectedItem();
    g.drawString(msg, 6, 120);
    msg = "Current Browser: ";
    msg += browser.getSelectedItem();
    g.drawString(msg, 6, 140);
  }
}
