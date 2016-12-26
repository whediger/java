
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventDemo {

  JLabel jlab;

  EventDemo(){

    JFrame jfrm = new JFrame("A event example");

    jfrm.setLayout(new FlowLayout());

    jfrm.setSize(220, 90);

    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton jbtnAlpha = new JButton("Alpha");
    JButton jbtnBeta = new JButton("Beta");

    jbtnAlpha.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae){
        jlab.setText("you pressed: Alpha");
      }
    });

    jbtnBeta.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent ae){
        jlab.setText("you pressed: Beta");
      }
    });

    jfrm.add(jbtnAlpha);
    jfrm.add(jbtnBeta);

    jlab = new JLabel("Press a button");

    //add a label to content pane
    jfrm.add(jlab);

    jfrm.setVisible(true);
  }

  public static void main(String args[])
  {
    SwingUtilities.invokeLater(new Runnable(){
      public void run() {
        new EventDemo();
      }
    });
  }
}
