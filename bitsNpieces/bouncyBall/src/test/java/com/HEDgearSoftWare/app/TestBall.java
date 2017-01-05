package com.HEDgearSoftWare.app;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestBall
{

  private int radius = 50;

  @Test
  public void testBallConstructor(){
    Ball ball = new Ball(100, 100, radius);

    assertTrue(ball.getX() == 100);
    assertTrue(ball.getY() == 100);
    assertTrue(ball.getRadius() == radius);
  }

  @Test
  public void testMoveBall(){
    Ball ball = new Ball(100, 100, radius);
    Vector2D displacement = new Vector2D(2, 3);

    ball.setDisplacement(displacement);
    ball.update();
    assertTrue(ball.getX() == 102);
    assertTrue(ball.getY() == 103);
  }

  @Test
  public void testMoveBallOffScreenRight(){
    Ball ball = new Ball(589, 100, radius);
    Vector2D displacement = new Vector2D(2, 3);

    ball.setDisplacement(displacement);
    ball.update();
    assertTrue(ball.getX() == Screen.WIDTH - (2 * ball.getRadius()) -1);
    assertTrue(ball.getY() == 103);

    //check if ball reversed direction
    assertTrue(ball.getDisplacement().getX() < 0);
  }

  @Test
  public void testMeveBallOffScreenLeft(){
    Ball ball = new Ball(1, 100, radius);

    Vector2D displacement = new Vector2D(-2, 3);
    ball.setDisplacement(displacement);
    ball.update();
    assertTrue(ball.getX() == 0);
    assertTrue(ball.getY() == 103);

    assertTrue(ball.getDisplacement().getX() > 0);
  }

  @Test
  public void testMoveBallOffScreenTop(){
    Ball ball = new Ball(100, 2, radius);

    Vector2D displacement = new Vector2D(2, -3);
    ball.setDisplacement(displacement);
    ball.update();

    assertTrue(ball.getY() == 0);
    assertTrue(ball.getX() == 102);

    assertTrue(ball.getDisplacement().getY() > 0);
  }
}
