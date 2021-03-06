
//pass param to applet
import java.awt.*;
import java.applet.*;

/*
<applet code="Param" height=80 width=300>
<param name=author value="Herb Schildt">
<param name=purpose value="demonstrate parameters">
<param name=version value=2>
</applet>
*/

public class Param extends Applet {
  String author;
  String purpose;
  int ver;


  public void start() {
    String temp;

    author = getParameter("author");
    if(author == null) author = "not found";

    purpose = getParameter("purpose");
    if(purpose == null) purpose = "not found";

    temp = getParameter("version");
    try {
      if(temp != null)
        ver = Integer.parseInt(temp);
      else
        ver = 0;
    } catch (NumberFormatException exc){
      ver = -1; //error code
    }
  }

  public void paint(Graphics g){
    g.drawString("Purpose: " + purpose, 10, 20);
    g.drawString("By: " + author, 10, 40);
    g.drawString("Version: " + ver, 10, 60);
  }

}
