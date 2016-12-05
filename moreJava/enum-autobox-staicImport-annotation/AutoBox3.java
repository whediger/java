
class AutoBox3 {
  public static void main(String args[])
  {
    Integer iOb, iOb2;
    int i;

    iOb = 99;
    System.out.println("original value of iOb: " + iOb);

    //the following automatically unboxes iOb
    //performs the increment, and then reboxes
    //the result into iOb
    ++iOb;
    System.out.println("After ++iOb " + iOb);

    //here iOb is unBoxed, the expression is evaluated
    //and the result is reboxed and assigned to iOb2.
    iOb2 = iOb + (iOb/3);
    System.out.println("iOb2 after the expression " + iOb2);

    //the same expression is evaluated, but the result is not reboxed
    i = iOb + (iOb / 3);
    System.out.println("i after expression: " + i);
  }
}
