
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
*   <applet code=JCheckBoxDemo height=50 width=250>
*   </applet>
*/

public class JCheckBoxDemo extends JApplet implements ItemListener
{
  JLabel jlab;

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

    JCheckBox cb = new JCheckBox("C");
    cb.addItemListener(this);
    add(cb);

    cb = new JCheckBox("C++");
    cb.addItemListener(this);
    add(cb);

    cb = new JCheckBox("Java");
    cb.addItemListener(this);
    add(cb);

    cb = new JCheckBox("Perl");
    cb.addItemListener(this);
    add(cb);

    jlab = new JLabel("Select Languages");
    add(jlab);
  }

  @Override
  public void itemStateChanged(ItemEvent ie) {
    JCheckBox cb = (JCheckBox)ie.getItem();
    
    if(cb.isSelected()) jlab.setText(cb.getText() + " is selected");
    else jlab.setText(cb.getText() + " is not selected");
  }
}
