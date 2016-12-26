
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
*   <applet code=JTextFieldDemo height=50 width=300>
*   </applet>
*/

public class JTextFieldDemo extends JApplet {
  JTextField jtf;

  public void init() {
    try {
      SwingUtilities.invokeAndWait(
        new Runnable() {
          public void run() {
            makeGUI();
          }
        }
      );
    } catch (Exception exc){
      System.out.println("Error: " + exc);
    }
  }

  private void makeGUI() {

    setLayout(new FlowLayout());

    jtf = new JTextField(15);
    add(jtf);
    jtf.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae){
        showStatus(jtf.getText());
      }
    });
  }
}
