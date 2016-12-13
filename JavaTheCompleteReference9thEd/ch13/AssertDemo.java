
//assertion demo

class AssertDemo {
  static int val = 3;

  //return an int
  static int getNum() {
    return val--;
  }

  public static void main(String args[])
  {
    int n;

    for (int i = -1; i < 10; i++) {
      n = getNum();

      assert n > 0; // will fail when n = 0!!!

      System.out.println("n is " + n);
    }
  }
}
