
import java.awt.*;
import javax.swing.*;

/*
*   <applet code=JTableDemo height=200 width=400>
*   </applet>
*/

public class JTableDemo extends JApplet {

  public void init() {
    try {
      SwingUtilities.invokeAndWait(
        new Runnable(){
          public void run(){
            makeGUI();
          }
        }
      );
    } catch (Exception exc){
      System.out.println(exc);
    }
  }

  private void makeGUI(){
    //initialize column headings
    String[] colHeads = { "Name", "Extension", "ID#" };

    //initialze data
    Object[][] data = {
      { "Gail", "4567", "865" },
      { "Ken", "7566", "555" },
      { "Viviane", "5634", "587" },
      { "Melanie", "7345", "922" },
      { "Anne", "1237", "333" },
      { "John", "5656", "314" },
      { "Matt", "5672", "217" },
      { "Claire", "6741", "444" },
      { "Erwin", "9023", "519" },
      { "Ellen", "1134", "532" },
      { "Jennifer", "5689", "112" },
      { "Ed", "9030", "133" },
      { "Helen", "6751", "145" }
    };

    JTable table = new JTable(data, colHeads);

    JScrollPane jsp = new JScrollPane(table);

    add(jsp);
  }
}
