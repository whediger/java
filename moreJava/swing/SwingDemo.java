import javax.swing.*;

class SwingDemo {
  SwingDemo() {
    //create new JFrame container
    JFrame jfrm = new JFrame("Asimple swing Application");

    //Give the frame an initial size
    jfrm.setSize(575, 100);

    //Terminate the program when closed
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //create a text-based label
    JLabel jlab = new JLabel(" Swing defines the modern Java GUI.(JavaFX?!!)");

    //add the label to the content pane
    jfrm.add(jlab);

    //Display the frame
    jfrm.setVisible(true);
  }

  public static void main(String args[])
  {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new SwingDemo();
      }
    });
  }
}
