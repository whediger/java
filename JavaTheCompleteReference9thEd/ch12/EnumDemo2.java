
//use builtin enum methods

enum Apple {
  Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo2 {
  public static void main(String args[])
  {
    Apple ap;

    System.out.println("all apple constants: ");

    Apple allApples[] = Apple.values();

    for(int i = 0; i < allApples.length; i++)
            System.out.println("Apple[" + i + "]: " + allApples[i]);

    System.out.println();

    ap = Apple.valueOf("Winesap");
    System.out.println("value of Winesap: " + ap);
  }
}
