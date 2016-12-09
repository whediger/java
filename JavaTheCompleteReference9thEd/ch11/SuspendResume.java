
class NewThread implements Runnable {
  String name;
  Thread t;
  boolean suspendFlg;

  NewThread(String threadName){
    name = threadName;
    t = new Thread(this, name);
    System.out.println("New Thread: " + name);
    suspendFlg = false;
    t.start();
  }

  public void run(){
    try {
      for (int i = 0; i < 15; i++) {
        System.out.println(name + ": " + i);
        Thread.sleep(200);
        synchronized(this) {
          while(suspendFlg){
            wait();
          }
        }
      }
    } catch (InterruptedException exc){
      System.out.println("exception in new thread: " + exc);
    }
    System.out.println(name + " exiting");
  }

  synchronized void mySuspend(){
    suspendFlg = true;
  }

  synchronized void myResume(){
    suspendFlg = false;
    notify();
  }
}

class SuspendResume {
  public static void main(String args[])
  {
    NewThread ob1 = new NewThread("one");
    NewThread ob2 = new NewThread("two");

    try {
      Thread.sleep(1000);
      ob1.mySuspend();
      System.out.println("Suspending thread one");
      Thread.sleep(1000);
      ob1.myResume();
      System.out.println("Resuming threaad one");
      ob2.mySuspend();
      System.out.println("suspending thread one");
      Thread.sleep(1000);
      ob2.myResume();
      System.out.println("resuming thread two");
    } catch (InterruptedException exc) {
      System.out.println("interuption in main " + exc);
    }

    //jwait for threads to finish
    try {
      System.out.println("Waiting for threads to finish");
      ob1.t.join();
      ob2.t.join();
    } catch (InterruptedException exc){
      System.out.println("interrupted in main, join() " + exc);
    }

    System.out.println("Main thread exiting +==]========>");
  }
}
