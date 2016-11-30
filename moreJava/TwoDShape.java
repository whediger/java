

//Use dynamic method dispatch
class TwoDShape {
  private double width;
  private double height;
  private String name;

  TwoDShape(){
    width = height = 0.0;
    name = "none";
  }

  TwoDShape(double w, double h, String n){
    width = w;
    height = h;
    name = n;
  }

  //constructor for equal length and height
  TwoDShape(double x, String n){
    width = height = x;
    name = n;
  }

  //construct an object from an object
  TwoDShape(TwoDShape ob){
    width = ob.width;
    height = ob.height;
    name = ob.name;
  }

  // Accessor methods for width and height
  double getWidth() { return width; }
  double getHeight() { return height; }
  void setWidth(double w) { width = w; }
  void setHeight(double h) { height = h; }

  String getName() { return name; }

  void showDim() {
    System.out.println("Width and height are " +
                        width + " and " + height);
  }
  double area() {
    System.out.println("area() must be overridden");
    return 0.0;
  }
}

class Triangle extends TwoDShape {
  private String style;

  Triangle() {
    super();
    style = "none";
  }

  Triangle(String s, double w, double h) {
    super(w, h, "triangle")

    style = s;
  }

  Triangle(double x) {
    super(x, "triangle");

    style = "filled";
  }

  Triangle(Triangle ob){
    super(ob);
    style = ob.style;
  }

  //override super area()
  double area() {
    return getWidth() * getHeight() / 2;
  }

  void showStyle() {
    System.out.println("Triangle is " + style);
  }
}
