
import java.awt.*;
import java.awt.Canvas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.Timer;


class Snake extends JPanel {
  Insets ins;

  public int snakeMax = (500*500)/(10*10);
  public int dotX[] = new int[snakeMax];
  public int dotY[] = new int[snakeMax];
  public int snakeLength = 4;

  public int appleX;
  public int appleY;

  public boolean runGame;
  public int direction;

  Snake() {
    setBorder(BorderFactory.createLineBorder(Color.BLACK));
    dotX[0] = 200;
    dotY[0] = 100;

    for (int i = 1; i <= 3; i++) {
      dotX[i] = dotX[0] - (10*i);
      dotY[i] = dotY[0];
    }

    runGame = true;
    direction = 39; //TODO replace numbers with enums
    randApple();
  }

  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    drawSnake(g);
    drawApple(g);
    Toolkit.getDefaultToolkit().sync();
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
  Snake playerSnake;
  private Timer timer;
  private final int DELAY = 150;

  Canvas dot;

  public void start() {
    frm = new JFrame("Dot Game");
    playerSnake = new Snake();

    frm.setSize(FRAME_HEIGHT, FRAME_WIDTH);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.addKeyListener(this);
    frm.setFocusable(true);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    frm.setLocation(dim.width/2-frm.getSize().width/2, dim.height/2-frm.getSize().height/2);

    playerSnake.setBackground(Color.GRAY);

    frm.add(playerSnake);
    frm.setVisible(true);

    timer = new Timer(DELAY, this);
    timer.start();
  }

  public void actionPerformed(ActionEvent e) {
    if (playerSnake.runGame){

      move(playerSnake.direction);
      playerSnake.repaint();
      // if(playerSnake.runGame) playerSnake.repaint();
    }

  }

  @Override
  public void keyPressed(KeyEvent e) {
    playerSnake.direction = e.getKeyCode();
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

  //use commented code for snake to touch
  //sides of window to end game
  public void checkCollision(){
    if (playerSnake.dotX[0] <= -10)
       playerSnake.dotX[0] = 0; //playerSnake.runGame = false;
    if (playerSnake.dotX[0] >= FRAME_WIDTH-0)
       playerSnake.dotX[0] = FRAME_WIDTH - 10; //playerSnake.runGame = false;
    if (playerSnake.dotY[0] >= FRAME_HEIGHT -20)
       playerSnake.dotY[0] = FRAME_HEIGHT - 30; //playerSnake.runGame = false;
    if (playerSnake.dotY[0] <= -10)
       playerSnake.dotY[0] = 0; //playerSnake.runGame = false;

    for(int i = playerSnake.snakeLength; i > 0; i--)  {
      //commenting following if statement will allow snake to travel through self
      if (playerSnake.dotY[0] == playerSnake.dotY[i] && playerSnake.dotX[0] == playerSnake.dotX[i])
          playerSnake.runGame = false;
    }
  }

  public void eatApple(){
    if(playerSnake.appleX == playerSnake.dotX[0] && playerSnake.appleY == playerSnake.dotY[0]){
      playerSnake.randApple();
      playerSnake.snakeLength += 3;
      playerSnake.repaint();
    }
  }

  public void move(int key) {
    //right is 39
    if (key == 39 && checkForSpace(key)){
      moveBody();
      playerSnake.dotX[0] += 10;
    //left is 37
    } else if (key == 37 && checkForSpace(key)){
      moveBody();
      playerSnake.dotX[0] -= 10;
    //up is 38
    } else if (key == 38 && checkForSpace(key)){
      moveBody();
      playerSnake.dotY[0] -= 10;
    //down is 40
    } else if (key == 40 && checkForSpace(key)){
      moveBody();
      playerSnake.dotY[0] += 10;
    }
    checkCollision();
    eatApple();
  }
  //returns true if snake is not turning back on self.
  public boolean checkForSpace(int key) {
    if (key == 39 && playerSnake.dotX[0] - playerSnake.dotX[1] >= 0) return true; //space to right
    if (key == 37 && playerSnake.dotX[0] - playerSnake.dotX[1] <= 0) return true; //space to left
    if (key == 38 && playerSnake.dotY[0] - playerSnake.dotY[1] <= 0) return true; //space above
    if (key == 40 && playerSnake.dotY[0] - playerSnake.dotY[1] >= 0) return true; //space below
    return false; //else return false, no space
  }

  public void moveBody(){
    for (int i = playerSnake.snakeLength; i > 0 ; i--) {
      playerSnake.dotY[i] = playerSnake.dotY[i-1];
      playerSnake.dotX[i] = playerSnake.dotX[i-1];
    }
  }


  public static void main(String args[])
  {
    Dot game = new Dot();
    game.start();
  }
}
