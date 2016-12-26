
import java.awt.*;
import javax.swing.*;

/*
*   <applet code=JLabelDemo height=200 width=250>
*   </applet>
*/

public class JLabelDemo extends JApplet {

  public void init(){
    try {
      SwingUtilities.invokeAndWait(
        new Runnable(){
          public void run(){
            makeGUI();
          }
        }
      );
    } catch (Exception exc) {
      System.out.println("Error: " + exc);
    }
  }

  private void makeGUI() {

    //create an icon
    ImageIcon ii = new ImageIcon("hourglass.gif");

    JLabel jl = new JLabel("Hourglass", ii, JLabel.CENTER);

    add(jl);
  }
}
