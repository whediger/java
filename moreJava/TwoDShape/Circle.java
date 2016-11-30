import java.lang.Math;


class Circle extends TwoDShape {
  Circle(){
    super();
  }

  Circle(double w, double h, String n) {
    super(w, h, "ellipse");
  }

  Circle(double w, double h){
    super(w, h, "ellipse");
  }

  Circle(double x, String n){
    super(x, "circle");
  }

  Circle(double x){
    super(x, "circle");
  }

  Circle(TwoDShape ob){
    super(ob);
  }

  public boolean isCircle() {
    return getWidth() == getHeight();
  }

  double area() {
    if (getWidth() == getHeight()) {
      return Math.PI * (getWidth() / 2) * (getWidth() / 2);
    }
    return Math.PI * (getWidth() / 2) * (getHeight() / 2);
  }
}
