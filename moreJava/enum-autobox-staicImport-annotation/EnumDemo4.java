
//demonstrate ordinal() and compareTo()

enum Transport {
  CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo4 {
  public static void main(String args[])
  {
    Transport tp, tp2, tp3;

    //obtain all ordinal values using ordinal();
    System.out.println("Here are all the ordinal Transport constants" +
                          " and their values.");
    for(Transport t : Transport.values())
      System.out.println(t + " " + t.ordinal());

    tp = Transport.AIRPLANE;
    tp2 = Transport.TRAIN;
    tp3 = Transport.AIRPLANE;

    System.out.println();

    //demonstrate compareTo()
    if(tp.compareTo(tp2) < 0)
      System.out.println(tp + " comes before " + tp2);
    if(tp.compareTo(tp2) > 0)
      System.out.println(tp + " comes after " + tp2);
    if(tp.compareTo(tp2) == 0)
      System.out.println(tp + " equals " + tp2);
  }
}
