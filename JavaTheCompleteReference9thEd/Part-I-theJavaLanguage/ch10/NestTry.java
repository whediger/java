
class NestTry {
  public static void main(String args[])
  {
    try {
      int a = args.length;

      //if no args present following is divide by zero
      int b = 42 / a;

      System.out.println("a = " + a);

      try {
        //if one command line arg then following is divide by zero
        if(a == 1) a = a/(a-a);
        //if 2 args then out of bounds except
        if (a == 2){
          int c[] = { 1 };
          c[42] = 59009;
        }
      } catch (ArrayIndexOutOfBoundsException exc) {
        System.out.println(exc);
      }
    } catch (ArithmeticException exc) {
      System.out.println(exc);
    }
  }
}
