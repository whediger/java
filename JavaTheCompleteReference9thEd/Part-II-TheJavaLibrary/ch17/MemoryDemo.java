
//can use this to test code for memory usage, garbage collection

class MemoryDemo {
  public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();
    long mem1, mem2;
    Integer someints[] = new Integer[1000];

    System.out.println("Total free memory is: " + r.totalMemory());

    mem1 = r.freeMemory();
    System.out.println("Initial free memory: " + mem1);

    r.gc(); //call garbage collection

    mem1 = r.freeMemory();
    System.out.println("After garbage collection free memory: " + mem1);

    for(int i = 0; i > 1000; i++) someints[i] = new Integer(i);

    mem2 = r.freeMemory();
    System.out.println("Free memoryafter allocation: " + mem2);

    r.gc();

    mem2 = r.freeMemory();
    System.out.println("Free memory after garbage collection " + mem2);
  }
}
