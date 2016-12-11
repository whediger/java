
import java.awt.*;
import java.awt.Canvas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.util.Random;


class Snake extends JPanel {
  Insets ins;

  public int snakeMax = (500*500)/(10*10);
  public int dotX[] = new int[snakeMax];
  public int dotY[] = new int[snakeMax];
  public int snakeLength = 4;

  public int appleX;
  public int appleY;

  public boolean runGame;

  Snake() {
    setBorder(BorderFactory.createLineBorder(Color.BLACK));
    dotX[0] = 200;
    dotY[0] = 100;

    for (int i = 1; i <= 3; i++) {
      dotX[i] = dotX[0] - (10*i);
      dotY[i] = dotY[0];
    }

    runGame = true;
    randApple();
  }

  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    drawSnake(g);
    drawApple(g);
  }

  private void drawApple(Graphics g){
    g.setColor(Color.RED);
    g.drawOval(appleX,appleY,10,10);
    g.fillOval(appleX,appleY,10,10);
  }

  public void randApple(){
    Random rand = new Random();
    //TODO: replace with an enum for all values
    appleX = (rand.nextInt(50 - 4) + 2)*10;
    appleY = (rand.nextInt(50 - 8) + 2)*10;
  }

  private void drawSnake(Graphics g){
    for (int i = 0; i < snakeLength; i++) {
      if (i == 0) g.setColor(Color.BLACK);
      else g.setColor(Color.WHITE);

      g.drawOval(dotX[i],dotY[i],10,10);
      g.fillOval(dotX[i],dotY[i],10,10);
    }
  }
}


public class Dot implements KeyListener, ActionListener {

  private final int FRAME_HEIGHT = 500;
  private final int FRAME_WIDTH = 500;
  private final int TILE_SIZE = 10; //value for height and width of tiles.

  JFrame frm;
  Snake pp;

  Canvas dot;

  public void start() {
    frm = new JFrame("Dot Game");
    pp = new Snake();

    frm.setSize(FRAME_HEIGHT, FRAME_WIDTH);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.addKeyListener(this);
    frm.setFocusable(true);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    frm.setLocation(dim.width/2-frm.getSize().width/2, dim.height/2-frm.getSize().height/2);

    pp.setBackground(Color.GRAY);

    frm.add(pp);
    frm.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();
    move(key);
    if(pp.runGame) pp.repaint();
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

  //use commented if vlock code to allow snake to touch
  //sides of window without ending game
  public void checkCollision(){
    if (pp.dotX[0] <= -10)
      pp.runGame = false; //pp.dotX[0] = 0;
    if (pp.dotX[0] >= FRAME_WIDTH-0)
      pp.runGame = false; //pp.dotX[0] = FRAME_WIDTH - 10;
    if (pp.dotY[0] >= FRAME_HEIGHT -20)
      pp.runGame = false; //pp.dotY[0] = FRAME_HEIGHT - 30;
    if (pp.dotY[0] <= -10)
      pp.runGame = false; //pp.dotY[0] = 0;

    for(int i = pp.snakeLength; i > 0; i--)  {
      //commenting following if statement will allow snake to travel through self
      if (pp.dotY[0] == pp.dotY[i] && pp.dotX[0] == pp.dotX[i])
          pp.runGame = false;
    }
  }

  public void eatApple(){
    if(pp.appleX == pp.dotX[0] && pp.appleY == pp.dotY[0]){
      pp.randApple();
      pp.snakeLength += 3;
      pp.repaint();
    }
  }

  public void move(int key) {
    //right is 39
    if (key == 39 && checkForSpace(key)){
      moveBody();
      pp.dotX[0] += 10;
    //left is 37
    } else if (key == 37 && checkForSpace(key)){
      moveBody();
      pp.dotX[0] -= 10;
    //up is 38
    } else if (key == 38 && checkForSpace(key)){
      moveBody();
      pp.dotY[0] -= 10;
    //down is 40
    } else if (key == 40 && checkForSpace(key)){
      moveBody();
      pp.dotY[0] += 10;
    }
    checkCollision();
    eatApple();
  }
  //returns true if snake is not turning back on self.
  public boolean checkForSpace(int key) {
    if (key == 39 && pp.dotX[0] - pp.dotX[1] >= 0) return true; //space to right
    if (key == 37 && pp.dotX[0] - pp.dotX[1] <= 0) return true; //space to left
    if (key == 38 && pp.dotY[0] - pp.dotY[1] <= 0) return true; //space above
    if (key == 40 && pp.dotY[0] - pp.dotY[1] >= 0) return true; //space below
    return false; //else return false, no space
  }

  public void moveBody(){
    for (int i = pp.snakeLength; i > 0 ; i--) {
      pp.dotY[i] = pp.dotY[i-1];
      pp.dotX[i] = pp.dotX[i-1];
    }
  }


  public static void main(String args[])
  {
    Dot game = new Dot();
    game.start();
  }
}
