
//create a thread by using Runnable

class MyThread implements Runnable {
  String thrdName;

  MyThread(String name) {
    thrdName = name;
  }

  //entry point of thread
  public void run() {
    System.out.println(thrdName + " starting.");
    try {
      for (int count = 0; count < 10; count++) {
        Thread.sleep(400);
        System.out.println("In " + thrdName + ", count is " + count);
      }
    }
    catch (InterruptedException exc) {
      System.out.println(thrdName + " interrupted.");
    }
    System.out.println(thrdName + " terminating.");
  }
}

class UseThreads {
  public static void main(String args[])
  {
    System.out.println("Main thread starting.");

    //first construct a MyThread object
    MyThread mt = new MyThread("Child #1");


    //Next, construct a thread from that object
    Thread newThrd = new Thread(mt);

    //finnaly, start execution of the thread
    newThrd.start();

    for (int i = 0; i < 50; i++) {
      System.out.print(".");
      try {
        Thread.sleep(100);
      } catch (InterruptedException exc){
        System.out.println("Main thread interrupted.");
      }
    }
    System.out.println("Main thread ending.");
  }
}
