
//use new exceptions

class QExcDemo {
  public static void main(String args[]){
    FixedQueue q = new FixedQueue(10);
    char ch;
    int i;

    try {
      //overrun the Queue
      for (i = 0; i < 11; i++) {
        System.out.println("Attempting to store: " + (char) ('A' + i));
        q.put((char) ('A' + i));
        System.out.println(" - OK");
      }
      System.out.println();
    } catch (QueueFullException exc) {
      System.out.println(exc);
    }
    System.out.println();

    try {
      //over-empty the Queue
      for (i = 0; i < 11; i++) {
        System.out.print("Getting next char: ");
        ch = q.get();
        System.out.println(ch);
      }
    } catch (QueueEmptyException exc){
      System.out.println(exc);
    }
  }
}
