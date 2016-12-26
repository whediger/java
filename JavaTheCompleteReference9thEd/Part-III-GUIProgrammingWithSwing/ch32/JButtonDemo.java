
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
*   <applet code=JButtonDemo height=750 width=250>
*   </applet>
*/

public class JButtonDemo extends JApplet implements ActionListener
{
  JLabel jlab;

  public void init(){
    try {
      SwingUtilities.invokeAndWait(
        new Runnable() {
          public void run(){
            makeGUI();
          }
        }
      );
    } catch (Exception exc) {
      System.out.println("Error: " + exc);
    }
  }

  private void makeGUI(){
    setLayout(new FlowLayout());

    ImageIcon hourglass = new ImageIcon("hourglass.gif");
    JButton jb = new JButton(hourglass);
    jb.setActionCommand("Hourglass");
    jb.addActionListener(this);
    add(jb);

    ImageIcon analog = new ImageIcon("analog.png");
    jb = new JButton(analog);
    jb.addActionListener(this);
    add(jb);

    ImageIcon digital = new ImageIcon("digital.png");
    jb = new JButton(digital);
    jb.addActionListener(this);
    add(jb);

    ImageIcon stopwatch = new ImageIcon("stopwatch.png");
    jb = new JButton(stopwatch);
    jb.addActionListener(this);
    add(jb);
  }

  public void actionPerformed(ActionEvent ae) {
    jlab.setText("you pressed: " + ae.getActionCommand());
  }
}
