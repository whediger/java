
//use semaphores to impliment a producer and consumer concurrency

import java.util.concurrent.Semaphore;


class Q {
  int n;

  //Start with consumer semaphore as unavailable
  static Semaphore semCon = new Semaphore(0);
  static Semaphore semProd = new Semaphore(1);

  void get() {
    try {
      semCon.acquire();
    } catch(InterruptedException exc){
      System.out.println("Error: semCon interrupted - " + exc);
    }

    System.out.println("Got: " + n);
    semProd.release();
  }

  void put() {
    try{
      semProd.acquire();
    } catch(InterruptedException exc){
      System.out.println("Error: semProd interrupted - " + exc);
    }

    this.n = n + 1;
    System.out.println("Put: " + n);
    semCon.release();
  }
}

class Producer implements Runnable {
  Q q;

  Producer(Q q){
    this.q = q;
    new Thread(this, "Producer").start();
  }

  public void run(){
    for(int i = 0; i < 20; i++) q.put();
  }
}

class Consumer implements Runnable {
  Q q;

  Consumer(Q q){
    this.q = q;
    new Thread(this, "Consumer").start();
  }

  public void run() {
    for(int i = 0; i < 20; i++) q.get();
  }
}

class ProdCon {
  public static void main(String args[]){
    Q q = new Q();
    new Consumer(q);
    new Producer(q);

  }
}
