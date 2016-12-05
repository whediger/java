
//find solution to qudratic equation
class Quadratic {
  public static void main(String args[])
  {
    //a, b and c represent the coefficients in the quadratic equation: ax^2 + bx + c = 0
    double a, b, c, x;

    //solve 4x^2 + x - 3 = 0 for x;
    a = 4;
    b = 1;
    c = -3;

    //find first solution
    x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    System.out.println("First solution: " + x);

    // find second solution
    x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    System.out.println("Second solution: " + x);
  }
}
