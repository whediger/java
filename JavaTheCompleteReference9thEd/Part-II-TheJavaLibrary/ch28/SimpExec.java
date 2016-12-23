
import java.util.concurrent.*;

class SimpExec {
  public static void main(String ars[])
  {
    CountDownLatch cd1 = new CountDownLatch(5);
    CountDownLatch cd2 = new CountDownLatch(5);
    CountDownLatch cd3 = new CountDownLatch(5);
    CountDownLatch cd4 = new CountDownLatch(5);
    ExecutorService ex = Executors.newFixedThreadPool(2);

    System.out.println("Starting");

    //start the threads
    ex.execute(new MyThread(cd1, "A"));
    ex.execute(new MyThread(cd2, "B"));
    ex.execute(new MyThread(cd3, "C"));
    ex.execute(new MyThread(cd4, "D"));

    try{
      cd1.await();
      cd2.await();
      cd3.await();
      cd4.await();
    }catch(InterruptedException exc){
      System.out.println(exc);
    }

    ex.shutdown();
    System.out.println("done  +==]========>");
  }
}

class MyThread implements Runnable {
  String name;
  CountDownLatch latch;

  MyThread(CountDownLatch cdl, String nm){
    name = nm;
    latch = cdl;
    new Thread(this);
  }

  @Override
  public void run(){
    for (int i = 0; i < 5; i++) {
      System.out.println(name + ": " + i);
      latch.countDown();
    }
  }
}
