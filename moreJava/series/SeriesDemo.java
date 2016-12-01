
class SeriesDemo {

  public static void main(String args[]){
//     ByTwos ob = new ByTwos();
//
//     for (int i = 0; i < 5; i++) {
//       System.out.println("Next value is: " + ob.getNext());
//     }
//
//     System.out.println("\nResetting");
//     ob.reset();
//     for (int i = 0; i < 5; i++)
//       System.out.println("Next value is: " + ob.getNext());
//
//     System.out.println("\nStarting at 100");
//     ob.setStart(100);
//     for (int i = 1; i < 100; i++)
//       System.out.println("Next value is: " + ob.getNext());
//
// System.out.println("ByThrees  +==]========>");
//
//     ByThrees ob3 = new ByThrees();
//
//     for (int i = 0; i < 5; i++) {
//       System.out.println("Next value is: " + ob3.getNext());
//     }
//
//     System.out.println("\nResetting");
//     ob3.reset();
//     for (int i = 0; i < 5; i++)
//       System.out.println("Next value is: " + ob3.getNext());
//
//     System.out.println("\nStarting at 100");
//     ob3.setStart(100);
//     for (int i = 1; i < 100; i++)
//       System.out.println("Next value is: " + ob3.getNext());
//

  // using an interface reference  +==]========>
    ByTwos twoOb = new ByTwos();
    ByThrees threeOb = new ByThrees();
    Series ob;

    for (int i = 0; i < 5; i++) {
      ob = twoOb;
      System.out.println("Next ByTwos value is: " + ob.getNext());

      ob = threeOb;
      System.out.println("Next ByThrees vlaue is: " + ob.getNext());
    }
  }
}
