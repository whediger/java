
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
  <applet code="ListDemo" height="180" width="300"></applet>
*/

public class ListDemo extends Applet implements ActionListener {
  List os, browser;
  String msg = "";

  public void init(){
    os = new List(4, true);
    browser = new List(4, false);

    os.add("Windows");
    os.add("Ubuntu");
    os.add("UNIX");
    os.add("Mac OS");

    browser.add("Internet Exploder");
    browser.add("Fire Fox");
    browser.add("Chrome");

    browser.select(2);

    add(os);
    add(browser);

    os.addActionListener(this);
    browser.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent ae){
    repaint();
  }

  public void paint(Graphics g) {
    int idx[];

    msg = "Current OS: ";
    idx = os.getSelectedIndexes();
    for(int i = 0; i < idx.length; i++)
      msg += os.getItem(idx[i]) + " ";
    g.drawString(msg, 6, 120);
    msg = "Current Browser: ";
    msg += browser.getSelectedItem();
    g.drawString(msg, 6, 140);
  }
}
