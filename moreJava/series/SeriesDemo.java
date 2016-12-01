
class SeriesDemo {

  public static void main(String args[]){
    ByTwos ob = new ByTwos();

    for (int i = 0; i < 5; i++) {
      System.out.println("Next value is: " + ob.getNext());
    }

    System.out.println("\nResetting");
    ob.reset();
    for (int i = 0; i < 5; i++)
      System.out.println("Next value is: " + ob.getNext());

    System.out.println("\nStarting at 100");
    ob.setStart(100);
    for (int i = 1; i < 100; i++)
      System.out.println("Next value is: " + ob.getNext());

System.out.println("BYThrees  +==]========>");

    ByThrees ob3 = new ByThrees();

    for (int i = 0; i < 5; i++) {
      System.out.println("Next value is: " + ob3.getNext());
    }

    System.out.println("\nResetting");
    ob3.reset();
    for (int i = 0; i < 5; i++)
      System.out.println("Next value is: " + ob3.getNext());

    System.out.println("\nStarting at 100");
    ob3.setStart(100);
    for (int i = 1; i < 100; i++)
      System.out.println("Next value is: " + ob3.getNext());
  }
}
