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

  public void setX(int n){
    point.x = n;
  }

  public int getY(){
    return point.y;
  }

  public void setY(int n){
    point.y = n;
  }

  public int getRadius(){
    return radius;
  }

  public void setDisplacement(Vector2D v){
    displacement = v;
  }

  public Vector2D getDisplacement(){
    return displacement;
  }

  public void update(){
    point.x += displacement.getX();
    point.y += displacement.getY();

    if (getX() > Screen.WIDTH - (2 * radius) - 1){
      setX(Screen.WIDTH - (2 * radius) -1);
      displacement.setX(-displacement.getX());
    }

    if (getX() < 0) {
      setX(0);
      displacement.setX(-displacement.getX());
    }

    if (getY() < 0) {
      setY(0);
      displacement.setY(-displacement.getY());
    }

    if(getY() > Screen.HEIGHT - (2 * radius) - 1){
      setY(Screen.HEIGHT - (2 * radius) - 1);
      displacement.setY(-displacement.getY());
    }
  }
}
