
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
  <applet code="SampleFonts" height=100 width=200></applet>

*/


public class SampleFonts extends Applet {
  int next = 0;
  Font f;
  String msg;

  public void init(){
    f = new Font("Dialog", Font.PLAIN, 12);
    msg = "Dialog";
    setFont(f);
    addMouseListener(new MyMouseAdapter(this));
  }

  public void paint(Graphics g) {
    g.drawString(msg, 4, 16);
  }
}

class MyMouseAdapter extends MouseAdapter {
  SampleFonts sampleFonts;

  public MyMouseAdapter(SampleFonts sampleFonts){
    this.sampleFonts = sampleFonts;
  }

  public void mousePressed(MouseEvent me){
    //switch fonts with each mouse click
    sampleFonts.next++;
    switch(sampleFonts.next){
      case 0:
        sampleFonts.f = new Font("Dialog", Font.PLAIN, 20);
        sampleFonts.msg = "Dialog";
        break;
      case 1:
        sampleFonts.f = new Font("DialogInput", Font.PLAIN, 20);
        sampleFonts.msg = "DialogInput";
        break;
      case 2:
        sampleFonts.f = new Font("SansSerif", Font.PLAIN, 20);
        sampleFonts.msg = "SansSerif";
        break;
      case 3:
        sampleFonts.f = new Font("Serif", Font.PLAIN, 20);
        sampleFonts.msg = "Serif";
        break;
      case 4:
        sampleFonts.f = new Font("MonoSpaced", Font.PLAIN, 20);
        sampleFonts.msg = "MonoSpaced";
        break;
    }

    if(sampleFonts.next == 4) sampleFonts.next = -1;

    sampleFonts.setFont(sampleFonts.f);
    sampleFonts.repaint();
  }
}
