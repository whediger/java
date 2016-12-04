
enum TrafficLightColor {
  RED, GREEN, YELLOW
}

//a computerized traffic light
class TrafficLightSimulator implements Runnable {
  private Thread thrd;
  private TrafficLightColor tlc;
  boolean stop = false;
  boolean changed = false;

  TrafficLightSimulator(TrafficLightColor init){
    tlc = init;

    thrd = new Thread(this);
    thrd.start();
  }

  TrafficLightSimulator(){
    tlc = TrafficLightColor.RED;

    thrd = new Thread(this);
    thrd.start();
  }

  public void run(){
    while(!stop){
      try {
        switch(tlc){
          case GREEN:
            Thread.sleep(10000);
            break;
          case YELLOW:
            Thread.sleep(2000);
            break;
          case RED:
            Thread.sleep(12000);
            break;
        }
      } catch (InterruptedException exc) {
      System.out.println("Interrupt in light simulator - " + exc);
      }
      changeColor();
    }
  }

  synchronized void changeColor(){
    switch(tlc) {
      case RED:
        tlc = TrafficLightColor.GREEN;
        break;
      case YELLOW:
        tlc = TrafficLightColor.RED;
        break;
      case GREEN:
        tlc = TrafficLightColor.YELLOW;
        break;
    }

    changed = true;
    notify();
  }

  synchronized void waitForChange(){
    try {
      while(!changed)
        wait();
      changed = false;
    } catch (InterruptedException exc){
      System.out.println(exc);
    }
  }

  //return current color
  synchronized TrafficLightColor getColor(){
    return tlc;
  }

  //stop traffic light
  synchronized void cancel() {
    stop = true;
  }
}

class TrafficLightDemo {
  public static void main(String args[])
  {
    TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);

    for (int i = 0; i < 9; i++) {
      System.out.println(t1.getColor());
      t1.waitForChange();
    }
    t1.cancel();
  }
}
