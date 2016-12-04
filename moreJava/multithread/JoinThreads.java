
//Use join()

class MyThread implements Runnable {
  Thread thrd;

  //construct new thread
  MyThread(String name) {
    thrd = new Thread(this, name);
    thrd.start(); //start the thread
  }

  //begin exicution of new thread
  public void run() {
    System.out.println(thrd.getName() + " starting.");
    try {
      for (int count = 0; count < 10; count++) {
        Thread.sleep(400);
        System.out.println("In " + thrd.getName() + " count is " + count);
      }
    } catch (InterruptedException exc) {
      System.out.print(thrd.getName() + " interupted.");
    }
    System.out.println(thrd.getName() + " terminating.");
  }
}

class JoinThreads {
  public static void main(String args[])
  {
    System.out.println("Main thread starting.");

    MyThread mt1 = new MyThread("Child #1");
    MyThread mt2 = new MyThread("Child #2");
    MyThread mt3 = new MyThread("Child #3");

    try {
      mt1.thrd.join();
      System.out.println("Child #1 joined.");
      mt2.thrd.join();
      System.out.println("Child #2 joined.");
      mt3.thrd.join();
      System.out.println("Child #3 joined.");
    } catch (InterruptedException exc){
      System.out.println("Main thread interrupted.");
    }
    System.out.println("main thread terminated.");
  }
}
