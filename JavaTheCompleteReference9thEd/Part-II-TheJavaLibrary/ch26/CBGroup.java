
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
  <applet code="CBGroup" height="200" width="240"></applet>
*/

public class CBGroup extends Applet implements ItemListener {
  String msg = "";
  Checkbox windows, android, solaris, mac;
  CheckboxGroup cbg;

  public void init(){
    cbg = new CheckboxGroup();
    windows = new Checkbox("Windows", cbg, true);
    android = new Checkbox("Andriod", cbg, false);
    solaris = new Checkbox("Solaris", cbg, false);
    mac = new Checkbox("Mac", cbg, false);

    add(windows);
    add(android);
    add(solaris);
    add(mac);

    windows.addItemListener(this);
    android.addItemListener(this);
    solaris.addItemListener(this);
    mac.addItemListener(this);
  }

  @Override
  public void itemStateChanged(ItemEvent ie){
    repaint();
  }

  //diaplay curent state of checkboxes
  public void paint(Graphics g){
    msg = "Current selection: ";
    msg += cbg.getSelectedCheckbox().getLabel();
    g.drawString(msg, 6, 100);
  }
}
