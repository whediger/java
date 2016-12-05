
//demonstrate a generic queue class

class GenQDemo {
  public static void main(String args[])
  {
    //create an integer queue
    Integer iStore[] = new Integer[10];
    GenQueue<Integer> q = new GenQueue<Integer>(iStore);

    Integer iVal;

    System.out.println("Demonstrate a que of integers");
    try {
      for (int i = 0; i < 5; i++) {
        System.out.println("Adding " + i + " to q.");
        q.put(i);
      }
    } catch (QueueFullException exc) {
      System.out.println("Queue is full. " + exc);
    }
    System.out.println();

    try {
      for (int i = 0; i < 5; i++) {
        System.out.println("getting next int from q: ");
        iVal = q.get();
        System.out.println(iVal);
      }
    } catch (QueueEmptyException exc) {
      System.out.println("q empty " + exc);
    }

    System.out.println();

    //create double q
    Double dStore[] = new Double[10];
    GenQueue<Double> q2 = new GenQueue<Double>(dStore);
    Double dVal;

    System.out.println("Demonstrate a queue of Doubles.");
    try {
      for (int i =0; i < 5; i++) {
        System.out.println("Adding " + (double)i/2 + " to q");
        q2.put((double)i/2);
      }
    } catch (QueueFullException exc) {
      System.out.println(exc);
    }
    System.out.println();

    try {
      for (int i = 0; i < 5; i++) {
        System.out.print("getting net double from q: ");
        dVal = q2.get();
        System.out.println(dVal);
      }
    } catch (QueueEmptyException exc){
      System.out.println(exc);
    }
  }
}
