//uses new age goto syntax
//>>>>>>>>use for breaking out of nested loops <<<<<<<<<<<<<<<<<<<<

class Break {
  public static void main(String args[])
  {
    boolean t = true;

    first: {
      second: {
        third: {
          System.out.println("Before the break");
          if(t) break second;//breaks out of second block
          System.out.println("this will not exicute");
        }
      System.out.println("this will not exicute");
      } //second
    System.out.println("hello after second block");
    }
    System.out.println();
    System.out.println(" +==]========>");
    System.out.println();

    //========================================
    //break out of outer loop from inner loops
    //========================================
    outer: for (int i = 0; i < 3; i++) {
      System.out.print("Pass " + i + ": ");
      for (int j = 0; j < 100; j++) {
        if(j == 10) break outer; //breaks out of both loops
      }
    }
  }
}
