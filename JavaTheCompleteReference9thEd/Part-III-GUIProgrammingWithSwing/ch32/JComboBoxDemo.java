
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
*   <applet code=JComboBoxDemo height=200 width=300>
*   </applet>
*/

public class JComboBoxDemo extends JApplet {
  JLabel jlab;
  ImageIcon hourglass, analog, digital, stopwatch;
  JComboBox<String> jcb;

  String timepieces[] = { "Hourglass.gif", "Analog.png", "Digital.png", "Stopwatch.png" };

  public void init() {
    try {
      SwingUtilities.invokeAndWait(
        new Runnable() {
          @Override
          public void run(){
            makeGUI();
          }
        }
      );
    } catch (Exception exc){
      System.out.println("Error: " + exc);
    }
  }

  private void makeGUI(){

    setLayout(new FlowLayout());

    jcb = new JComboBox<String>(timepieces);
    add(jcb);

    jcb.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae){
        String s = (String) jcb.getSelectedItem();
        jlab.setIcon(new ImageIcon(s));
      }
    });

    jlab = new JLabel(new ImageIcon("hourglass.gif"));
    add(jlab);
  }
}
