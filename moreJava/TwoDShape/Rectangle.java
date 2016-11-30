class Rectangle extends TwoDShape {
  Rectangle() {
    super();
  }

  Rectangle(double w, double h) {
    super(w, h, "rectangle");
  }

  Rectangle(double x) {
    super(x, "rectangle");
  }

  Rectangle(Rectangle ob){
    super(ob);
  }

  boolean isSquare() {
    if (getWidth() == getHeight()) return true;
    return false;
  }

  //override area()
  double area() {
    return getWidth() * getHeight();
  }
}
