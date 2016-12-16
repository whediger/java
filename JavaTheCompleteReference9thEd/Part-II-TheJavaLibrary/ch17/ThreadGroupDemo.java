
class NewThread extends Thread {
  boolean suspendFlag;

  NewThread(String threadName, ThreadGroup thrdGroup){
    super(thrdGroup, threadName);
    System.out.println("New Thread: " + this);
    suspendFlag = false;
    start(); //start the thread
  }

  public void run(){
    try{
      for (int i = 5; i > 0; i--) {
        System.out.println(getName() + ": " + i);
        Thread.sleep(1000);
        synchronized(this){
          while(suspendFlag){
            wait();
          }
        }
      }
    } catch(Exception exc) {
      System.out.println("Exception in: " + getName());
    }
    System.out.println(getName() + " Exiting.");
  }

  synchronized void mySuspend(){
    suspendFlag = true;
  }

  synchronized void myResume(){
    suspendFlag = false;
    notify();
  }
}


class ThreadGroupDemo {
  public static void main(String args[])
  {
    long startTime = System.currentTimeMillis();//time operation

    ThreadGroup groupA = new ThreadGroup("GroupA");
    ThreadGroup groupB = new ThreadGroup("GroupB");

    NewThread ob1 = new NewThread("one", groupA);
    NewThread ob2 = new NewThread("two", groupA);
    NewThread ob3 = new NewThread("three", groupB);
    NewThread ob4 = new NewThread("four", groupB);

    System.out.println("\nOutput from list: ");
    groupA.list();
    groupB.list();
    System.out.println();

    System.out.println("Suspending Group A");
    Thread tga[] = new Thread[groupA.activeCount()];
    groupA.enumerate(tga);
    for(int i = 0; i < tga.length; i++)
      ((NewThread)tga[i]).mySuspend();

    try {
      Thread.sleep(4000);
    } catch(InterruptedException exc){
      System.out.println("Main thread interrupted");
    }

    System.out.println("Resuming group A");
    for(int i = 0; i < tga.length; i++)
      ((NewThread)tga[i]).myResume();


    //wait for threads to finish
    try{
      System.out.println("Waiting for threads to finish");
      ob1.join();
      ob2.join();
      ob3.join();
      ob4.join();
    } catch(Exception exc){
      System.out.println("Exception in main thread");
    }
    System.out.println("main thread exiting");

    long endTime = System.currentTimeMillis();
    System.out.println("time of operation: " + (endTime - startTime) + "µ");
  }
}
