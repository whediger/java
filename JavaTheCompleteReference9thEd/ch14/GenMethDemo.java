
class GenMethDemo {

  //determine if ob is in Array
  static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
    for (int i = 0; i < y.length; i++) {
      if(x.equals(y[i])) return true;
    }
    return false;
  }

  public static void main(String args[])
  {
    Integer nums[] = {1,2,3,4,5,6,7};

    if(isIn(2, nums)) System.out.println("2 is in nums");
    if(isIn(7, nums)) System.out.println("7 is in nums");

    System.out.println();

    String str[] = {"one", "two", "three", "four", "five", "six"};

    if(isIn("two", str)) System.out.println("'two' is in strings");
    if(isIn("seven", str)) System.out.println("'seven' is in strings");

    //use is in on strings


  }
}
