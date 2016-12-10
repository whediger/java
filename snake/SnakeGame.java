
package snake;

import java.awt.*;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.Random;

public class SnakeGame extends Canvas{

  static final int FRAME_HEIGHT = 500;
  static final int FRAME_WIDTH = 500;
  static final int TILE_SIZE = 10; //value for height and width of tiles.

  public int appleX;
  public int appleY;

  JFrame frm;
  Canvas c;
  Canvas apple;
  Canvas snake;

  public void startGame(){
    frm = new JFrame("Snake Game");
    c = new SnakeGame();

    frm.setSize(FRAME_HEIGHT, FRAME_WIDTH);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    c.setSize(FRAME_HEIGHT, FRAME_WIDTH);
    c.setBackground(Color.GREEN);

    addApple();

    addSnake();

    frm.add(c);
    frm.setVisible(true);

  }

  public void addSnake() {
    snake = new SnakeGame();

  }

  public void addApple(){

    apple = new SnakeGame();
    apple.setSize(TILE_SIZE, TILE_SIZE);

    Random rand = new Random();
    int appleY = rand.nextInt(FRAME_HEIGHT - 40) + 20;
    int appleX = rand.nextInt(FRAME_WIDTH - 40) + 20;
    apple.setLocation(appleX, appleY);
    apple.setBackground(Color.RED);

    frm.add(apple);
  }

  public static void main(String args[])
  {
    SnakeGame game = new SnakeGame();
    game.startGame();

  }


}
