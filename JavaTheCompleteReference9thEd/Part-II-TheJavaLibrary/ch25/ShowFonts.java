
import java.awt.*;
import java.applet.*;

//display fonts

/*
  <applet code="ShowFonts" height=60 width=550></applet>

*/

public class ShowFonts extends Applet {
  public void paint(Graphics g){
    String msg = "";
    String FontList[];

    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

    FontList = ge.getAvailableFontFamilyNames();
    for(int i = 0; i < FontList.length; i++)
      msg += FontList[i] + " ";

    g.drawString(msg, 4, 16);
  }
}
