
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*

  <applet code="AppletFrame" width=300 height=50></applet>

*/

//create subclass of frame
class SampleFrame extends Frame {
  SampleFrame(String title){
    super(title);

    //create object to handle window events
    MyWindowAdapter adapter = new MyWindowAdapter(this);

    addWindowListener(adapter);
  }

  public void paint(Graphics g){
    g.drawString("This is in frame window", 10, 40);
  }
}


class MyWindowAdapter extends WindowAdapter {
  SampleFrame sampleFrame;

  public MyWindowAdapter(SampleFrame sampleFrame){
    this.sampleFrame = sampleFrame;
  }

  public void windowClosing(WindowEvent we){
    sampleFrame.setVisible(false);
  }
}

//create frame window
public class AppletFrame extends Applet {
  Frame f;

  public void init(){
    f = new SampleFrame("A frame window");

    f.setSize(250, 250);
    f.setVisible(true);
  }

  public void start(){
    f.setVisible(true);
  }

  public void stop() {
    f.setVisible(false);
  }

  public void paint(Graphics g){
    g.drawString("This is an applet window",  10, 20);
  }
}
