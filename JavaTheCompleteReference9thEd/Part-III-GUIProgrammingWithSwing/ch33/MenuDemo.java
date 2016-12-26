
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class MenuDemo implements ActionListener {

  JLabel jlab;

  MenuDemo() {

    JFrame jfrm = new JFrame("Menu Demo");

    jfrm.setLayout(new FlowLayout());

    jfrm.setSize(220, 200);

    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    jlab = new JLabel();

    JMenuBar jmb = new JMenuBar();

    JMenu jmFile = new JMenu("File");
    JMenuItem jmiOpen = new JMenuItem("Open");
    JMenuItem jmiClose = new JMenuItem("Close");
    JMenuItem jmiSave = new JMenuItem("Save");
    JMenuItem jmiExit = new JMenuItem("Exit");
    jmFile.add(jmiOpen);
    jmFile.add(jmiClose);
    jmFile.add(jmiSave);
    jmFile.addSeparator();
    jmFile.add(jmiExit);
    jmb.add(jmFile);

    JMenu jmOptions = new JMenu("Options");

    // create the colors submenus
    JMenu jmColors = new JMenu("Colors");
    JMenuItem jmiRed = new JMenuItem("Red");
    JMenuItem jmiGreen = new JMenuItem("Green");
    JMenuItem jmiBlue = new JMenuItem("Blue");
    jmColors.add(jmiRed);
    jmColors.add(jmiGreen);
    jmColors.add(jmiBlue);
    jmOptions.add(jmColors);

    //priority sub-menu
    JMenu jmPriority = new JMenu("Priority");
    JMenuItem jmiHigh = new JMenuItem("High");
    JMenuItem jmiLow = new JMenuItem("Low");
    jmPriority.add(jmiHigh);
    jmPriority.add(jmiLow);
    jmOptions.add(jmPriority);

    //create reset Menu item
    JMenuItem jmiReset = new JMenuItem("Reset");
    jmOptions.addSeparator();
    jmOptions.add(jmiReset);

    //entire options menu add to menubar
    jmb.add(jmOptions);


    //help Menu
    JMenu jmHelp = new JMenu("Help");
    JMenuItem jmiAbout = new JMenuItem("About");
    jmHelp.add(jmiAbout);
    jmb.add(jmHelp);

    jmiOpen.addActionListener(this);
    jmiClose.addActionListener(this);
    jmiSave.addActionListener(this);
    jmiExit.addActionListener(this);
    jmiRed.addActionListener(this);
    jmiGreen.addActionListener(this);
    jmiBlue.addActionListener(this);
    jmiHigh.addActionListener(this);
    jmiLow.addActionListener(this);
    jmiReset.addActionListener(this);
    jmiAbout.addActionListener(this);

    jfrm.add(jlab);

    jfrm.setJMenuBar(jmb);

    jfrm.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent ae){
    String comStr = ae.getActionCommand();

    if(comStr.equals("Exit")) System.exit(0);

    jlab.setText(comStr + " Selected");
  }

  public static void main(String args[])
  {
    SwingUtilities.invokeLater(
      new Runnable(){
        public void run(){
          new MenuDemo();
        }
      }
    );
  }
}
