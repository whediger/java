
import java.util.concurrent.*;

class BarDemo{
  public static void main(String args[])
  {
    CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

    System.out.println("Starting...");

    new MyThread(cb, "A");
    new MyThread(cb, "B");
    new MyThread(cb, "C");
    new MyThread(cb, "D");
    new MyThread(cb, "E");
    new MyThread(cb, "F");
  }
}

//a thread of exicution that uses CyclicBarrier

class MyThread implements Runnable {
  CyclicBarrier cbar;
  String name;

  MyThread(CyclicBarrier c, String n){
    name = n;
    cbar = c;
    new Thread(this).start();
  }

  @Override
  public void run(){

    System.out.println(name);

    try{
      cbar.await();
    } catch (BrokenBarrierException exc) {
      System.out.println("Error: Broken Barrier - " + exc);
    } catch (InterruptedException exc){
      System.out.println("Error: thread Interrupted - " + exc);
    }
  }
}

class BarAction implements Runnable {
  public void run(){
    System.out.println("Barrier Reached!");
  }
}
