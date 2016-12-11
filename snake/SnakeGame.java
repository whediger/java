
package snake;

import java.awt.*;
import java.awt.Canvas;
import javax.swing.JFrame;
import java.util.Random;
import javax.swing.Timer;//to add the delay

public class SnakeGame extends Canvas {

  private final int FRAME_HEIGHT = 500;
  private final int FRAME_WIDTH = 500;
  private final int TILE_SIZE = 10; //value for height and width of tiles.
  private final int DELAY = 150;

  public  boolean playGame = true;

  JFrame frm;
  Canvas c;

  Canvas apple;
  private int appleX;
  private int appleY;

  Canvas snake;
  private int snakeLength = 3;
  private int snakeMax = (500*500) - (10*10);
  private int snakeX[] = new int[snakeMax];
  private int snakeY[] = new int[snakeMax];

  Canvas snakeBody;

  private boolean moveRight = true;
  private boolean moveLeft = false;
  private boolean moveUp = false;
  private boolean moveDown = false;

  public void startGame(){
    frm = new JFrame("Snake Game");
    c = new SnakeGame();

    frm.setSize(FRAME_HEIGHT, FRAME_WIDTH);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    c.setSize(FRAME_HEIGHT, FRAME_WIDTH);
    c.setBackground(Color.GREEN);

    addApple();

    addSnake();

    moveSnake();

    frm.add(c);
    frm.setVisible(true);


  }

  public void moveSnake() {

    if(moveRight == true){
      int move = snakeX[0] + TILE_SIZE;
      for(int i = snakeLength; i >= 0; i--){
        if (i == 0){
          snakeX[0] = move;
          System.out.println("snakeX[0]: " + snakeX[0]);
          break;
        }
        snakeX[i] = snakeX[(i - 1)];
        System.out.println("snakeX["+i+"]: " + snakeX[i]);
        snake.setLocation(snakeX[i], snakeY[i]);
      }
    }
  }

  public void addSnake() {
    snakeX[0] = 200;
    snakeY[0] = 100;

    snake = new SnakeGame();
    snake.setSize(TILE_SIZE, TILE_SIZE);

    snake.setLocation(snakeX[0],snakeY[0]); //starts at same location
    snake.setBackground(Color.BLUE);

    frm.add(snake);

    for (int i = 1; i <= snakeLength; i++) {
      snake = new SnakeGame();
      snake.setSize(TILE_SIZE, TILE_SIZE);
      snake.setBackground(Color.BLUE);
      snakeX[i] = snakeX[0] - (10*i);
      snakeY[i] = snakeY[0];
      snake.setLocation(snakeX[i], snakeY[i]);
      frm.add(snake);
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
