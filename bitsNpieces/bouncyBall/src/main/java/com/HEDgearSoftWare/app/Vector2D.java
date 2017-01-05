package com.HEDgearSoftWare.app;


public class Vector2D
{
  private int x;
  private int y;

  Vector2D(int x, int y){
      this.x = x;
      this.y = y;
  }

  public int getX(){
    return this.x;
  }

  public void setX(int n){
    this.x = n;
  }

  public int getY(){
    return this.y;
  }

  public void add(Vector2D v){
    this.x += v.getX();
    this.y += v.getY();
  }

  public void multiply(int n){
    this.x *= n;
    this.y *= n;
  }
}
