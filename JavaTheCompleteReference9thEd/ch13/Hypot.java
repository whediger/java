
//compute the hypotenuse

class Hypot {
  public static void main(String args[])
  {
    double side1, side2;

    double hypot;
    side1 = 3.0;
    side2 = 4.0;

    hypot = Math.sqrt(Math.pow(side1, 2)) +
              Math.pow(side2, 2);

    System.out.println("A(" + side1 + ")^2 + " +"B(" + side2 + ")^2  => " + "C(" + hypot + ")");
  }
}
