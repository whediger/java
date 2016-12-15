
//override toString() for Box class
class Box {
  double width;
  double height;
  double depth;

  Box(double w, double h, double d){
    width = w;
    height = h;
    depth = d;
  }

  //override toString() in java.lang
  @Override
  public String toString(){
    return "Dimensions are, width: " + width + " height: " + height + " depth: " + depth;
  }
}

class ToStringDemo {
  public static void main(String[] args) {
    Box b = new Box(10,12,14);
    String s = "Box b: " + b; //concatinate Box object, calls toString()!

    System.out.println(b);
    System.out.println(s);
  }
}
