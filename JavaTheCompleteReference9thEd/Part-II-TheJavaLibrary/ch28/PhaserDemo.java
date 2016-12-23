
import java.util.concurrent.*;

class PhaserDemo {
  public static void main(String args[])
  {
    Phaser phsr = new Phaser(1);
    int curPhase;

    System.out.println("Starting");

    new MyThread(phsr, "A");
    new MyThread(phsr, "B");
    new MyThread(phsr, "C");

    //wait for all threads to compleate Phase one
    curPhase = phsr.getPhase();
    phsr.arriveAndAwaitAdvance();
    System.out.println("Phase " + curPhase + " Compleate");

    //wait for all threads to complete phase two
    curPhase = phsr.getPhase();
    phsr.arriveAndAwaitAdvance();
    System.out.println("Phase " + curPhase + " Compleate");

    //wait for all threads to complete phase three
    curPhase = phsr.getPhase();
    phsr.arriveAndAwaitAdvance();
    System.out.println("Phase " + curPhase + " Compleate");

    //deregister the main thread
    phsr.arriveAndDeregister();

    if(phsr.isTerminated())
      System.out.println("Phaser is terminated");
  }
}

class MyThread implements Runnable {
  Phaser phsr;
  String name;

  MyThread(Phaser p, String n){
    name = n;
    phsr = p;
    phsr.register();
    new Thread(this).start();
  }

  public void run(){

    System.out.println("Thread: " + name + " beginning phase one");
    phsr.arriveAndAwaitAdvance();

    //pause to prevent jumbled output {{unneeded for backend use}}
    try {
      Thread.sleep(10);
    } catch (InterruptedException exc){
      System.out.println(exc);
    }

    System.out.println("Thread: " + name + " beginning phase two");
    phsr.arriveAndAwaitAdvance();

    //pause to prevent jumbled output
    try {
      Thread.sleep(10);
    } catch (InterruptedException exc){
      System.out.println(exc);
    }

    System.out.println("Thread: " + name + " beginning phase three");
    phsr.arriveAndDeregister();
  }
}
