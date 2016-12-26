
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/*
*   <applet code=JListDemo height=120 width=200>
*   </applet>
*/

public class JListDemo extends JApplet {

  JList<String> jlst;
  JLabel jlab;
  JScrollPane jscrlp;

  String cities[] = { "New York", "Chicago", "Houston",
                    "Denver", "Los Angeles", "Seattle",
                    "London", "Paris", "New Delhi",
                    "Hong Kong", "Tokyo", "Sydney" };

  public void init() {
    try {
      SwingUtilities.invokeAndWait(
        new Runnable(){
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

    jlst = new JList<String>(cities);

    jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    jscrlp = new JScrollPane(jlst);

    jscrlp.setPreferredSize(new Dimension(120, 90));

    jlab = new JLabel("Choose a city");

    jlst.addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent le) {
        int idx = jlst.getSelectedIndex();

        if(idx != -1) jlab.setText("Current Selection: " + cities[idx]);
        else jlab.setText("Choose a city");
      }
    });

    add(jscrlp);
    add(jlab);
  }
}
