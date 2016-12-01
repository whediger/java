
public class IsTriangle {


  /* Tests if lengths of three sides are able to form a triangle
   * @param a, b, c are lengths of potential triangle
   * @return true if side lengths may make a triangle, flase if they cannot
  **/
  public static boolean isTriangle(int a, int b, int c){

    if ( a > (b + c) ||
         b > (a + c) ||
         c > (a + b)){
      return false;
    } else {
      return true;
    }

  }

  public static void main(String[] args) {
    boolean triangle;
    triangle = isTriangle(7,3,3);
    System.out.println(triangle);
  }
}
