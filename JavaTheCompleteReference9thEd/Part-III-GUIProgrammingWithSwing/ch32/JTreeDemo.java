
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

/*
*   <applet code=JTreeDemo height=200 width=400>
*   </applet>
*/

public class JTreeDemo extends JApplet {
  JTree tree;
  JLabel jlab;

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
    //create top node of tree
    DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");

    DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
    top.add(a);
    DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
    a.add(a1);
    DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
    a.add(a2);

    //create subtree B
    DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
    top.add(b);
    DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
    b.add(b1);
    DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
    b.add(b2);

    //create the tree
    tree = new JTree(top);

    //add tree to scroll pane
    JScrollPane jsp = new JScrollPane(tree);

    //add jsp to content pane
    add(jsp);

    //add label to to the content pane
    jlab = new JLabel();
    add(jlab, BorderLayout.SOUTH);
    tree.addTreeSelectionListener(new TreeSelectionListener(){
      public void valueChanged(TreeSelectionEvent tse) {
        jlab.setText("Selection is " + tse.getPath());
      }
    });
  }
}
