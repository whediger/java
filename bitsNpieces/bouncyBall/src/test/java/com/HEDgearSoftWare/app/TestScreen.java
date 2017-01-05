package com.HEDgearSoftWare.app;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;



public class TestScreen {
  Screen screen;

  public void testScreenDimensions(){
    screen = new Screen();

    assertTrue(screen.WIDTH == 640);
    assertTrue(screen.HEIGHT == 480);
  }
}
