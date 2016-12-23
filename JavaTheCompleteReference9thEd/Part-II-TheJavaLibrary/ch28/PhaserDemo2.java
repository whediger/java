
//extend Phaser and override onAdvance() to limit number of phases exicuted
import java.util.concurrent.*;

//extend MyPhaser to allow specified number of phases
class MyPhaser extends Phaser {
  int numPhases;

  MyPhaser(int parties, int phaseCount){
    super(parties);
    numPhases = phaseCount - 1;
  }

  @Override //to limit # of phases
  protected boolean onAdvance(int p, int regParties){
    //output for learning purposes
    System.out.println("Phase " + p + " completed");
    if(p == numPhases || regParties == 0) return true;
    else return false;
  }
}

class PhaserDemo2 {
  public static void main(String args[])
  {
    MyPhaser phsr = new MyPhaser(1, 4);

    System.out.println("Starting\n");

    new MyThread(phsr, "A");
    new MyThread(phsr, "B");
    new MyThread(phsr, "C");

    //wait for specified # of phases to complete
    while(!phsr.isTerminated()){
      phsr.arriveAndAwaitAdvance();
    }

    System.out.println("The phaser is terminated");
  }
}

//a thread of exicution that uses Phaser
class MyThread implements Runnable {
  Phaser phsr;
  String name;

  MyThread(Phaser p, String name){
    phsr = p;
    this.name = name;
    phsr.register();
    new Thread(this).start();
  }

  @Override
  public void run(){
    while(!phsr.isTerminated()) {
      System.out.println("Thread " + name + " begining phase " + phsr.getPhase());
      phsr.arriveAndAwaitAdvance();

      //pause to prevent jumbled output {{not needed in backend ops}}
      try {
        Thread.sleep(10);
      } catch(InterruptedException exc){
        System.out.println("Error: sleep interrupted - " + exc);
      }
    }
  }
}
