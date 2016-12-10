
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

  JFrame frm;
  Canvas c;

  Canvas apple;
  public int appleX;
  public int appleY;

  Canvas snakeHead;
  public int snakeLength = 3;
  Canvas snakeBody;

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

  public void moveSnake() {

  }

  public void addSnake() {
    snakeHead = new SnakeGame();
    snakeHead.setSize(TILE_SIZE, TILE_SIZE);

    int startX = 200;
    int startY = 100;

    snakeHead.setLocation(startX,startY); //starts at same location
    snakeHead.setBackground(Color.BLUE);

    frm.add(snakeHead);

    for (int i = 1; i <= snakeLength; i++) {
      snakeBody = new SnakeGame();
      snakeBody.setSize(TILE_SIZE, TILE_SIZE);
      snakeBody.setBackground(Color.BLUE);
      snakeBody.setLocation((startX - (10*i)), startY);
      frm.add(snakeBody);
    }


    System.out.println("snake length: " + snakeLength);

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
