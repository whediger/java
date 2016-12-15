
enum Apple {
  Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo4 {
  public static void main(String args[])
  {
    Apple ap, ap2, ap3;

    //obtain all ordinal values using ordinal()
    System.out.println("all consts and values:");

    for(Apple a : Apple.values())
      System.out.println(a + " has a value of " + a.ordinal());

     ap = Apple.RedDel;
    ap2 = Apple.GoldenDel;
    ap3 = Apple.RedDel;

    System.out.println();

    if(ap.compareTo(ap2) < 0)
      System.out.println(ap + " comes before " + ap2);
    if(ap.compareTo(ap2) > 0)
      System.out.println(ap + " comes after " + ap2);
    if(ap.compareTo(ap3) == 0)
      System.out.println(ap + " is equal to " + ap3);

    System.out.println();

    if(ap.equals(ap2))
      System.out.println("Error!! ln 32");
    if(ap.equals(ap3))
      System.out.println(ap + " equals " + ap3);
    if(ap == ap3)
      System.out.println(ap + " equals " + ap3);
  }
}
