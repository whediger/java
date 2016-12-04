
//use a synchronized block to control access to SunArray

class SumArray {
  private int sum;

  int sumArray(int nums[]){

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      System.out.println("Running total for " + Thread.currentThread().getName() +
                                            " is " + sum);
      try {
        Thread.sleep(10); //all tsk-switch
      } catch (InterruptedException exc){
        System.out.println("Thread Interrupted.");
      }
    }
    return sum;
  }
}

class MyThread implements Runnable {
  Thread thrd;
  static SumArray sa = new SumArray();
  int a[];
  int answer;

  //construct a new thread
  MyThread(String name, int nums[]){
    thrd = new Thread(this, name);
    a = nums;
    thrd.start();
  }

  //beign exicution of new thread
  public void run () {
    int sum;

    System.out.println(thrd.getName() + " starting.");

    //synchronize calls to sum array
    synchronized(sa) {
      answer = sa.sumArray(a);
    }
    System.out.println("Sum for " + thrd.getName() + " is " + answer);
    System.out.println(thrd.getName() + " terminating.");
  }
}

class ObjRef {
  public static void main(String args[])
  {
    int a[] = { 1,2,3,4,5 };

    MyThread mt1 = new MyThread("Child #1", a);
    MyThread mt2 = new MyThread("Chold #2", a);

    try {
      mt1.thrd.join();
      mt2.thrd.join();
    } catch (InterruptedException exc) {
      System.out.println("Thread in main interrupted.");
    }
  }
}
