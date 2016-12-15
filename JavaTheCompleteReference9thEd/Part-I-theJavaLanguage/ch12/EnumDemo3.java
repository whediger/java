
enum Apple {
  Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

  private int price;

  Apple(int p) { price = p; }

  int getPrice() { return price; }
}


class EnumDemo3 {
    public static void main(String args[])
    {
      Apple ap;

      //display price of ap;
      System.out.println("Winesap costs " + Apple.Winesap.getPrice());

      System.out.println("All apple prices");
      for(Apple a : Apple.values())
        System.out.println("price of " + a + " is " + a.getPrice());
    }
}
