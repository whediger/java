
import java.util.concurrent.locks.*;

class LockDemo {
  public static void main(String args[])
  {
    ReentrantLock lock = new ReentrantLock();

    new LockThread(lock, "A");
    new LockThread(lock, "B");
  }
}

class Shared {
  static int count = 0;
}

//a thread of exicution that increments count
class LockThread implements Runnable {
  String name;
  ReentrantLock lock;

  LockThread(ReentrantLock l, String n){
    name = n;
    lock = l;
    new Thread(this).start();
  }

  @Override
  public void run() {

    System.out.println("Starting " + name);

    try {
      // first lock count
      System.out.println(name + " is waiting to lock count");
      lock.lock();
      System.out.println(name + " is locking count");

      Shared.count++;
      System.out.println(name + " shared count " + Shared.count);

      //now allow a context switch if possible
      System.out.println(name + " is sleeping");
      Thread.sleep(1000);
    } catch (InterruptedException exc){
      System.out.println(exc);
    } finally {
      //unlock
      System.out.println(name + " is unlocking");
      lock.unlock();
    }
  }
}
