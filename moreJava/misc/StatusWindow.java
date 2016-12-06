
//using a status window

import java.awt.*;
import java.applet.*;

/*
<applet code="StatusWindow" height=50 width=300></applet>
*/

public class StatusWindow extends Applet {
  //display message in applet window
  public void paint(Graphics g){
    g.drawString("This is in the Applet window", 10, 20);
    showStatus("this is shown in the status window.");
  }
}
