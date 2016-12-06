
//demonstrate simple JList

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class ListDemo implements ListSelectionListener {

  JList<String> jlst;
  JLabel jlab;
  JScrollPane jscrlp;

  //create an array of names;
  String names[] = { "Sherry", "jon", "rahcel", "Sashsa",
                    "Joslyn", "randy", "tom", "ken", "andrew",
                    "matt", "Todd" };

  ListDemo() {
    //new Jfrom container
    JFrame jfrm = new JFrame("JList demo");

    jfrm.setLayout(new FlowLayout());

    jfrm.setSize(200, 160);

    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //create a JList
    jlst = new JList<String>(names);

    //set list to single selection mode
    jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


    //add list to scroll pane
    jscrlp = new JScrollPane(jlst);

    //set prefered size of scroll pane
    jscrlp.setPreferredSize(new Dimension(120, 90));

    //make label that displays the selection
    jlab = new JLabel("Please choose a name");

    //add list selection handler
    jlst.addListSelectionListener(this);

    jfrm.add(jscrlp);
    jfrm.add(jlab);

    jfrm.setVisible(true);
  }

  //handle list selection events
  public void valueChanged(ListSelectionEvent le) {
    int idx = jlst.getSelectedIndex();
    //Display sleection, ifiten was selected
    if(idx != -1)
      jlab.setText("Current Selection: " + names[idx]);
    else
      jlab.setText("please choose a name");
  }

  public static void main(String args[])
  {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new ListDemo();
      }
    });
  }
}
