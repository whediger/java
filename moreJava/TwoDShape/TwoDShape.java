

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
