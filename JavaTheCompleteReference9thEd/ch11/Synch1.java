
class CallMe {
  void call(String msg){
    System.out.print("[" + msg);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException exc) {
      System.out.println("interrupted in child " + exc);
    }
    System.out.println("]");
  }
}

class Caller implements Runnable {
  String msg;
  CallMe target;
  Thread t;

  public Caller(CallMe targ,  String s){
    target = targ;
    msg = s;
    t = new Thread(this);
    t.start();
  }

  //synchronized calls!!!
  public void run(){
    synchronized(target) {
      target.call(msg);
    }
  }
}

class Synch1 {
  public static void main(String args[])
  {
    CallMe target = new CallMe();
    Caller ob1 = new Caller(target, "hello");
    Caller ob2 = new Caller(target, "synchronized");
    Caller ob3 = new Caller(target, "world");

    try {
      ob1.t.join();
      ob2.t.join();
      ob3.t.join();
    } catch (InterruptedException exc) {
      System.out.println("interrupted in main");
    }
  }
}
