
//create second thread by extending Thread

class NewThread extends Thread {
  NewThread(){
    //create new second thread
    super("demo thread");
    System.out.println("Child thread: " + this);
    start();
  }

  //this is the entry point for the second thread
  public void run() {
    try {
      for (int i = 0; i < 5; i++) {
        System.out.println("child thread " + i);
        Thread.sleep(500);
      }
    } catch (InterruptedException exc){
      System.out.println("child thread interrupted - " + exc);
    }
    System.out.println("exiting child thread.");
  }
}

class ExtendThread {
  public static void main(String args[])
  {
    new NewThread();

    try{
      for (int i = 0; i < 5; i++) {
        System.out.println("Main thread: " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException exc){
      System.out.println("main threed interrupted " + exc);
    }
    System.out.println("Main thread exiting.");
  }
}
