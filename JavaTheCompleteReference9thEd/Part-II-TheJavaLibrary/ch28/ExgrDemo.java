
import java.util.concurrent.Exchanger;

class ExgrDemo {
  public static void main(String args[])
  {
    Exchanger<String> exgr = new Exchanger<String>();

    new UseString(exgr);
    new MakeString(exgr);
  }
}

class MakeString implements Runnable {
  Exchanger<String> ex;
  String str;

  public MakeString(Exchanger<String> e){
    ex = e;
    str = new String();
    new Thread(this).start();
  }

  public void run() {
    char ch = 'A';

    for (int i = 0; i < 3; i++) {

      //fill buffer
      for (int j = 0; j < 5; j++) str += ch++;

      try {
        //Echange full buffer for an empty one
        str = ex.exchange(str);
      } catch (InterruptedException exc) {
        System.out.println("Error: interrupted - " + exc);
      }
    }
  }
}

class UseString implements Runnable {
  Exchanger<String> ex;
  String str;

  UseString(Exchanger<String> e) {
    ex = e;
    new Thread(this).start();
  }

  public void run(){

    for(int i = 0; i < 3; i++){
      try {
        //Exchange an empty buffer for a full one
        str = ex.exchange(new String());
        System.out.println("Got: " + str);
      } catch (InterruptedException exc){
        System.out.println("Error: intteruption - " + exc);
      }
    }
  }
}
