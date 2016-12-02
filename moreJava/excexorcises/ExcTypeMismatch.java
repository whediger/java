//this will not work to handle out of bounds exc
class ExcTypeMismatch {
  public static void main(String args[]){
    int nums[] = new int[4];

    try {
      System.out.println("Before the exc");

      //index out of bounds
      nums[7] = 10;
      System.out.println("not displayed");
    } catch (ArithmeticException exc){
      System.out.println("index out of bounds exc");
    }

    System.out.println("after try/catch block");
  }
}
