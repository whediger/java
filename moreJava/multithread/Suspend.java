
//suspending, resuming, and stopping a thread

class MyThread implements Runnable {
  Thread thrd;

  boolean suspended;
  boolean stopped;

  MyThread(String name){
    thrd = new Thread(this, name);
    suspended = false;
    stopped = false;
    thrd.start();
  }

  //this is the entry point for a thread
  public void run(){
    System.out.println(thrd.getName() + " starting.");
    try {
      for (int i = 0; i < 1000; i++) {
        System.out.print(i + " ");
        if((i % 10 == 0)) {
          System.out.println();
          Thread.sleep(250);
        }

        //use synchronized block to check suspended and stop
        synchronized(this) {
          while(suspended)
            wait();
        }
        if(stopped) break;
      }
    } catch (InterruptedException exc){
      System.out.println(thrd.getName() + " interrupted.");
    }
    System.out.println(thrd.getName() + " exiting.");
  }

  //stop the thread
  synchronized void mystop() {
    stopped = true;
    //the following ensures a suspended thread will be stopped
    suspended = false;
    notify();
  }

  //suspend the thread
  synchronized void mysuspend() {
    suspended = true;
  }

  synchronized void myresume() {
    suspended = false;
    notify();
  }
}


class Suspend {
  public static void main(String args[])
  {
    MyThread ob1 = new MyThread("My Thread");

    try {
      Thread.sleep(1000); //let ob1 start exicuting

      ob1.mysuspend();
      System.out.println("Suspending thread.");
      Thread.sleep(1000);

      ob1.myresume();
      System.out.println("Resuming thread.");
      Thread.sleep(1000);

      ob1.mysuspend();
      System.out.println("Suspending thread.");
      Thread.sleep(1000);

      ob1.myresume();
      System.out.println("Resuming thread");
      Thread.sleep(1000);

      ob1.mysuspend();
      System.out.println("Stoping thread.");
      ob1.mystop();
    } catch (InterruptedException exc){
      System.out.println("Main thread intterupted.");
    }

    //wait for thread to finish
    try {
      ob1.thrd.join();
    } catch (InterruptedException exc) {
      System.out.println("Main thread intterupted in Join");
    }

    System.out.println("main thread exiting.");
  }
}
