package com.HEDgearSoftWare.app;

import java.awt.Point;

public class Ball
{
  private Point point;
  private int radius;
  private Vector2D displacement;

  Ball(int x, int y, int r){
    point = new Point();
    point.x = x;
    point.y = y;
    radius = r;
  }

  public int getX(){
    return point.x;
  }

  public int getY(){
    return point.y;
  }

  public int getRadius(){
    return radius;
  }

  public void setDisplacement(Vector2D v){
    displacement = v;
  }

  public void update(){
    point.x += displacement.getX();
    point.y += displacement.getY();
  }
}
