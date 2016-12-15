

class NewThread implements Runnable {
  String name;
  Thread t;

  public NewThread(String n) {
    name = n;
    t = new Thread(this, name);
    System.out.println("New thread: " + t);
    t.start();
  }

  public void run() {
    try {
      for (int i = 0; i < 5; i++) {
        System.out.println(name + ": " + i);
        Thread.sleep(500);
      }
    } catch (InterruptedException exc) {
      System.out.println("child thread interrupted " + exc);
    }
    System.out.println("child thread ending");
  }
}

class DemoJoin {
  public static void main(String args[])
  {
    NewThread ob1 = new NewThread("one");
    NewThread ob2 = new NewThread("two");
    NewThread ob3 = new NewThread("three");

    System.out.println("thread one is Alive: " + ob1.t.isAlive());
    System.out.println("thread two is Alive: " + ob2.t.isAlive());
    System.out.println("thread three is Alive: " + ob3.t.isAlive());

    try {
      System.out.println("waiting for threads to finish");

      ob1.t.join();
      ob2.t.join();
      ob3.t.join();
    } catch (InterruptedException exc){
      System.out.println("interruption in main");
    }

    System.out.println("thread one is Alive: " + ob1.t.isAlive());
    System.out.println("thread two is Alive: " + ob2.t.isAlive());
    System.out.println("thread three is Alive: " + ob3.t.isAlive());

    System.out.println("main thread exiting");
  }
}
