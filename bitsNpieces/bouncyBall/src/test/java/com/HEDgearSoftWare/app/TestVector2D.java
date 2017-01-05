package com.HEDgearSoftWare.app;

import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

/**
*   bouncyBall is a short exorcise made just for fun
*/

public class TestVector2D {

  Vector2D displacement;
  Vector2D vector2;

  @Test
  public void testConstructor(){
    displacement = new Vector2D(2, 3);

    assertTrue(displacement.getX() == 2);
    assertTrue(displacement.getY() == 3);
  }

  @Test
  public void testAdd(){
    displacement = new Vector2D(2, 3);
    vector2 = new Vector2D(-1, -1);

    displacement.add(vector2);
    assertTrue(displacement.getX() == 1);
    assertTrue(displacement.getY() == 2);
  }
}
