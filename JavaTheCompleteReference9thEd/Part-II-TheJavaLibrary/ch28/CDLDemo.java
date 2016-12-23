
import java.util.concurrent.CountDownLatch;

class CDLDemo {
  public static void main(String args[])
  {
    CountDownLatch cdl = new CountDownLatch(5);

    System.out.println("Starting");

    new MyThread(cdl);

    try{
      cdl.await();
    } catch(InterruptedException exc){
      System.out.println(exc);
    }

    System.out.println("Done: 8)");
  }
}

class MyThread implements Runnable {
  CountDownLatch latch;

  public MyThread(CountDownLatch c){
    latch = c;
    new Thread(this).start();
  }

  public void run(){
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
      latch.countDown();
    }
  }
}
