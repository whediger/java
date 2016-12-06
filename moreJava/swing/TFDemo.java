//use a text field

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TFDemo implements ActionListener {

  JTextField jtf;
  JButton jbtnRev;
  JLabel jlabPrompt, jlabContents;

  TFDemo() {

    //create new jframe container
    JFrame jfrm = new JFrame("Use a Text Field");

    //specify a flow layout
    jfrm.setLayout(new FlowLayout());

    //Give the frame an initial set
    jfrm.setSize(240, 120);

    //terminate on close
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //create a text Field
    jtf = new JTextField(10);

    //set action commands for the Field
    jtf.setActionCommand("myTF");

    //create reverse button
    JButton jbtnRev = new JButton("Reverse");

    //add action listeners
    jtf.addActionListener(this);
    jbtnRev.addActionListener(this);

    //create the labels
    jlabPrompt = new JLabel("Enter text: ");
    jlabContents = new JLabel("");

    //add components to content pane
    jfrm.add(jlabPrompt);
    jfrm.add(jtf);
    jfrm.add(jbtnRev);
    jfrm.add(jlabContents);

    //display frame
    jfrm.setVisible(true);
  }

  //hndle events >>> override actionPerformed in ActionListener
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getActionCommand().equals("Reverse")) {
      //the reverse button was pressed
      String orgStr = jtf.getText();
      String resStr = "";

      //reverse the string in the text Field
      for(int i = orgStr.length()-1; i >= 0; i--)
        resStr += orgStr.charAt(i);

      //store reversed string in the text Field
      jtf.setText(resStr);
    } else
      //enter was pressed while focus was in text Field
      jlabContents.setText("You pressed ENTER, Text is: " + jtf.getText());
  }

  public static void main(String args[])
  {
    SwingUtilities.invokeLater(new Runnable() {
      public void run(){
        new TFDemo();
      }
    });
  }
}
