class DynShapes {
  public static void main(String[] args){
    TwoDShape shapes[] = new TwoDShape[6];

    shapes[0] = new Triangle("outlined", 8.0, 12.0);
    shapes[1] = new Rectangle(10);
    shapes[2] = new Rectangle(10, 4);
    shapes[3] = new Triangle(7.0);
    shapes[4] = new Circle(8.0, 5.0);
    shapes[5] = new Circle(5.0);

    for (int i = 0; i < shapes.length; i++) {
      System.out.println("object is " + shapes[i].getName());
      System.out.println("Area is " + shapes[i].area());
      System.out.println();
    }
  }
}
