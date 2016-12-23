
import java.util.concurrent.*;

class SemDemo {
  public static void main(String[] args) {
    Semaphore sem = new Semaphore(1);


    new IncThread(sem, "A");
    new DecThread(sem, "B");
  }
}

//A shared resource
class Shared {
  static int count = 0;
}

class IncThread implements Runnable {
  String name;
  Semaphore sem;

  IncThread(Semaphore s, String str){
    name = str;
    sem = s;
    new Thread(this).start();
  }

  @Override
  public void run(){
    System.out.println("Starting " + name);

    try {
      //first get permit
      System.out.println(name + " is waiting for a permit.");
      sem.acquire();
      System.out.println(name + " gets a permit");

      //now access a shared resource;
      for (int i = 0; i < 5; i++) {
        Shared.count++;
        System.out.println(name + ": " + Shared.count);

        //now allow a context switch if possible
        Thread.sleep(10);
      }
    } catch(InterruptedException exc) {
      System.out.println("Error: interupted thread  - " + exc);
    }

    //release the permit
    System.out.println(name + " releases the permit");
    sem.release();
  }
}

class DecThread implements Runnable {
  String name;
  Semaphore sem;

  DecThread(Semaphore s, String str){
    name = str;
    sem = s;
    new Thread(this).start();
  }

  public void run() {

    System.out.println("Starting: " + name);

    try {
      //first get a permit
      System.out.println(name + " is waiting for a permit");
      sem.acquire();
      System.out.println(name + " has a permit");
      for (int i = 0; i < 5 ; i++) {
        Shared.count--;
        System.out.println(name + " uses permit: " + Shared.count);
      }

      Thread.sleep(10);
    } catch (InterruptedException exc) {
      System.out.println("Error: Interuption in DecThread - " + exc);
    }

    //release the permit
    sem.release();
  }


}
