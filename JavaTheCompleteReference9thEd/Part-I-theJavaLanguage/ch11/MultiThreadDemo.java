
//creates multiple threads
class NewThread implements Runnable {
  String name;
  Thread t;

  NewThread(String n) {
    name = n;
    t = new Thread(this, name);
    System.out.println("New Thread: " + t);
    t.start();
  }

  public void run() {
    try {
      for (int i = 0; i < 5; i++) {
        System.out.println(name + ": " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException exc){
      System.out.println("interupted in child thread: " + exc);
    }
    System.out.println("child thread ending.");
  }
}

class MultiThreadDemo {
  public static void main(String args[])
  {
    new NewThread("one");
    new NewThread("two");
    new NewThread("three");

    try {
      Thread.sleep(10000);
    } catch (InterruptedException exc){
      System.out.println("thread interrupted in main");
    }
    System.out.println("main thread exiting");
  }
}
