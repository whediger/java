
import java.util.*;

//this is the observing class
class Watcher implements Observer {
  public void update(Observable obj, Object arg){
    System.out.println("update() called, count is " + ((Integer)arg).intValue());
  }
}

//this is the class being observed
class BeingWatched extends Observable {
  void counter(int period){
    for (; period >= 0; period--) {
      setChanged();
      notifyObservers(new Integer(period));
      try {
        Thread.sleep(1000);
      } catch(InterruptedException exc){
        System.out.println("Error: sleep interrupted");
      }
    }
  }
}

class ObserverDemo {
  public static void main(String args[])
  {
    BeingWatched observed = new BeingWatched();
    Watcher observing = new Watcher();

    //add the observing to the list of observers for observed Object
    observed.addObserver(observing);

    observed.counter(10);
  }
}
