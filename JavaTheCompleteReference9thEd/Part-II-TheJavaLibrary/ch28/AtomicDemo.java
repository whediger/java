
import java.util.concurrent.atomic.*;

class AtomicDemo {
  public static void main(String args[])
  {
    new AtomicThread("A");
    new AtomicThread("B");
    new AtomicThread("C");
  }
}

class Shared {
  static AtomicInteger ai = new AtomicInteger(0);
}

//a thread that increments the count
class AtomicThread implements Runnable {
  String name;

  AtomicThread(String n) {
    name = n;
    new Thread(this).start();
  }

  @Override
  public void run(){

    System.out.println("Starting " + name);

    for(int i = 0; i <= 3; i++)
      System.out.println(name + " got: " + Shared.ai.getAndSet(i));
  }
}
