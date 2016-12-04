//creates multiple threads

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
        System.out.println("In " + thrd.getName() + ", count is " + count);
      }
    } catch (InterruptedException exc) {
      System.out.println(thrd.getName() + " interrupted.");
    }
    System.out.println(thrd.getName() + " terminating.");
  }
}

class MoreThreads {
  public static void main(String args[])
  {
    System.out.println("Main thread starting.");
    MyThread mt1 = new MyThread("Child #1");
    MyThread mt2 = new MyThread("Child #2");
    MyThread mt3 = new MyThread("Child #3");
    MyThread mt4 = new MyThread("Child #4");
    MyThread mt5 = new MyThread("Child #5");
    MyThread mt6 = new MyThread("Child #6");
    MyThread mt7 = new MyThread("Child #7");
    MyThread mt8 = new MyThread("Child #8");
    MyThread mt9 = new MyThread("Child #9");
    MyThread mt10 = new MyThread("Child #10");
    MyThread mt11 = new MyThread("Child #11");
    MyThread mt12 = new MyThread("Child #12");

    do {
      System.out.print(".");
      try {
        Thread.sleep(100);
      } catch (InterruptedException exc) {
        System.out.println("Main thread interrupted.");
      }
    } while
    (
        mt1.thrd.isAlive() ||
        mt2.thrd.isAlive() ||
        mt3.thrd.isAlive() ||
        mt4.thrd.isAlive() ||
        mt5.thrd.isAlive() ||
        mt6.thrd.isAlive() ||
        mt7.thrd.isAlive() ||
        mt8.thrd.isAlive() ||
        mt9.thrd.isAlive() ||
        mt10.thrd.isAlive() ||
        mt11.thrd.isAlive() ||
        mt12.thrd.isAlive()
    );
    System.out.println("Main thread terminating.");
  }
}
