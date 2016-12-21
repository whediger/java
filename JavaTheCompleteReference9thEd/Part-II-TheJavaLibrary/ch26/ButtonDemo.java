
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
  <applet code="ButtonDemo" height="150" width="250"></applet>
*/

public class ButtonDemo extends Applet implements ActionListener {
  String msg = "";
  Button yes, no, maybe;

  public void init(){
    yes = new Button("Yes");
    no = new Button("No");
    maybe = new Button("Maybe");

    add(yes);
    add(no);
    add(maybe);

    yes.addActionListener(this);
    no.addActionListener(this);
    maybe.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae){
    String str = ae.getActionCommand();

    if(str.equals("Yes")) msg = "You pressed: 'yes'";
    else if(str.equals("No")) msg = "You Pressed: 'No'";
    else msg = "You Pressed: 'Maybe'";

    repaint();
  }

  public void paint(Graphics g) {
    g.drawString(msg, 6, 100);
  }
}
