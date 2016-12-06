//simple abnner applet

import java.awt.*;
import java.applet.*;
/*
<applet code="Banner" width= 300 height=50></applet>
*/

public class Banner extends Applet implements Runnable {
  String msg = " Java Rules the Web ";
  Thread t;
  boolean stopFlag;

  //Initialize t to null
  public void init() {
    t = null;
  }

  public void start() {
    t = new Thread(this);
    stopFlag = false;
    t.start();
  }

  public void run() {
    //Redisplay Banner
    for (; ; ) {
      try{
        repaint();
        Thread.sleep(250);
        if(stopFlag)
          break;
      } catch(InterruptedException exc) {
        System.out.println(exc);
      }
    }
  }

  public void stop() {
    stopFlag = true;
    t = null;
  }

  public void paint(Graphics g) {
    char ch;

    ch = msg.charAt(0);
    msg = msg.substring(1, msg.length());
    msg += ch;
    g.drawString(msg, 50, 30);
  }
}
