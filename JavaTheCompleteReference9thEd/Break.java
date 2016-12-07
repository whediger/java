//uses new age goto syntax

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
  }
}
