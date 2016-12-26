
import java.awt.*;
import javax.swing.*;

/*
*   <applet code=JScrollPaneDemo height=250 width=300>
*   </applet>
*/

public class JScrollPaneDemo extends JApplet {

  public void init(){
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
    //add 400 buttons to a panel
    JPanel jp = new JPanel();
    jp.setLayout(new GridLayout(20, 20));
    int b = 0;

    for (int i = 0; i < 20; i++) {
      for(int j = 0; j < 20; j++)
        jp.add(new JButton("Button " + b));
        ++b;
    }

    JScrollPane jsp = new JScrollPane(jp);

    //add scrool pane to -content- panel
    add(jsp, BorderLayout.CENTER);
  }
}
