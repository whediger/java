package com.HEDgearSoftWare.app;

import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

/**
*   bouncyBall is a short exorcise made just for fun
*/

public class TestVector2D {

  @Test
  public void testConstructor(){
    Vector2D displacement = new Vector2D(2, 3);
    assertTrue(displacement.getX() == 2);
    assertTrue(displacement.getY() == 3);
  }
}
