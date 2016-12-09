
class NewThread implements Runnable {
  Thread t;

  NewThread() {
    //creat a new, second Thread
    t = new Thread(this, "Demo Thread");
    System.out.println("Child Thread: " + t);
    t.start();
  }

  public void run() {
    try {
      for (int i = 0; i < 5; i++) {
        System.out.println("Child Thread: " + i);
        Thread.sleep(500);
      }
    } catch (InterruptedException exc) {
      System.out.println("Inerrupted Child Thread: " + exc);
    }
    System.out.println("exiting child thread.");
  }
}

class ThreadDemo {
  public static void main(String args[])
  {
    new NewThread();

    try {
        for (int i = 0; i < 5; i++) {
          System.out.println("Main Thread: " + i);
          Thread.sleep(1000);
        }
      } catch (InterruptedException exc) {
        System.out.println("Interruption in Main " + exc);
    }
    System.out.println("Main thread exiting. +==]========>");
  }
}
