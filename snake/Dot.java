
import java.awt.*;
import java.awt.Canvas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;


class PaintPanel extends JPanel {
  Insets ins;

  public int dotX = 200;
  public int dotY = 100;

  PaintPanel() {
    setBorder(BorderFactory.createLineBorder(Color.BLACK));
  }

  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.drawOval(dotX,dotY,10,10);
    g.fillOval(dotX,dotY,10,10);
  }
}


public class Dot implements KeyListener, ActionListener {

  private final int FRAME_HEIGHT = 500;
  private final int FRAME_WIDTH = 500;
  private final int TILE_SIZE = 10; //value for height and width of tiles.

  JFrame frm;
  PaintPanel pp;

  Canvas dot;

  public void start() {
    frm = new JFrame("Dot Game");
    pp = new PaintPanel();

    frm.setSize(FRAME_HEIGHT, FRAME_WIDTH);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.addKeyListener(this);
    frm.setFocusable(true);

    pp.setBackground(Color.GREEN);

    frm.add(pp);
    frm.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();
    move(key);
    pp.repaint();
  }

  @Override
  public void keyReleased(KeyEvent e) {
    //set vals to flase on keyup to stop movement
    int key = e.getKeyCode();
    // System.out.println("key released: " + key);
  }

  @Override
  public void keyTyped(KeyEvent e) {
    int key = e.getKeyCode();
    // System.out.println("key typed: " + key);
  }


  //right is 39
  //left is 37
  //up is 38
  //down is 40
  public void move(int key) {
    if (key == 39){
      pp.dotX += 10;
    } else if (key == 37){
      pp.dotX -= 10;
    } else if (key == 38){
      pp.dotY -= 10;
    } else if (key == 40){
      pp.dotY += 10;
    }
  }

  public static void main(String args[])
  {
    Dot game = new Dot();
    game.start();
  }
}
