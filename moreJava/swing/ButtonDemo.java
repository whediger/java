
//push button and handle events
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemo implements ActionListener {
  JLabel jlab;

  ButtonDemo() {
    //create a new JFrame container
    JFrame jfrm = new JFrame("A Button Example");

    // specify flowlayout of the layout manager
    jfrm.setLayout(new FlowLayout());

    jfrm.setSize(220, 90);

    //terminate on close
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //make two buttons
    JButton jbtnUp = new JButton("Up");
    JButton jbtnDown = new JButton("Down");

    //add action listeners
    jbtnUp.addActionListener(this);
    jbtnDown.addActionListener(this);

    //add btns to content frame
    jfrm.add(jbtnUp);
    jfrm.add(jbtnDown);

    //create label
    jlab = new JLabel("press a button");

    //add label
    jfrm.add(jlab);

    //display the frame
    jfrm.setVisible(true);
  }

  //handle button events
  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Up"))
      jlab.setText("You pressed up");
    else
      jlab.setText("You pressed down");
  }

  public static void main(String args[])
  {
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        new ButtonDemo();
      }
    });
  }
}
