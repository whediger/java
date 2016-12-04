
//controlling the main thread

class UseMain {
  public static void main(String args[])
  {
    Thread thrd;

    //Get the main thread
    thrd = Thread.currentThread();

    //Display the main threads name
    System.out.println(thrd.getName() + " is name of main thread.");

    //Display main threads Priority
    System.out.println("Main threads priority: " + thrd.getPriority());

    System.out.println();

    //set the name and priority
    System.out.println("Setting name and priority");
    thrd.setName("Thread #2084");
    thrd.setPriority(Thread.NORM_PRIORITY+3);

    System.out.println("Main thread now called: " + thrd.getName());
    System.out.println("Main thread priority now: " + thrd.getPriority());
  }
}
