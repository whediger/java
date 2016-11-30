class Triangle extends TwoDShape {
  private String style;

  Triangle() {
    super();
    style = "none";
  }

  Triangle(String s, double w, double h) {
    super(w, h, "triangle");

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
