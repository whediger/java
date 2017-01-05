package com.HEDgearSoftWare.app;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBall
{

  @Test
  public void testBallConstructor(){
    Ball ball = new Ball(100, 100, 50);

    assertTrue(ball.getX() == 100);
    assertTrue(ball.getY() == 100);
    assertTrue(ball.getRadius() == 50);
  }

  @Test
  public void testMoveBall(){
    Ball ball = new Ball(100, 100, 50);
    Vector2D displacement = new Vector2D(2, 3);

    ball.setDisplacement(displacement);
    ball.update();
    assertTrue(ball.getX() == 102);
    assertTrue(ball.getY() == 103);
  }
}
