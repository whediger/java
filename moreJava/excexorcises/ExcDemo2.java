
class ExcTest {
  static void genException() {
    int nums[] = new int[4];

    System.out.println("Before the exception");

    //generate exception
    nums[7] = 10;
    System.out.println("after the exception");
  }
}

class ExcDemo2 {
  public static void main(String ags[]){

    try {
      ExcTest.genException();
    } catch (ArrayIndexOutOfBoundsException exc) {
      System.out.println("HEYY!!! NO GOOD! array index out of bounds");
    }

    System.out.println("After try/catch block");
  }
}
