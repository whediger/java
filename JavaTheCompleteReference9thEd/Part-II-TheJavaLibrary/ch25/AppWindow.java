
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//create a frame window
public class AppWindow extends Frame {
  String keymsg = "this is a test";
  String mousemsg = "";
  int mouseX = 30, mouseY = 30;

  public void appWindow() {
    addKeyListener(new MyKeyAdapter(this));
    addMouseListener(new MyMouseAdapter(this));
    addWindowListener(new MyWindowAdapter());
  }

  public void paint(Graphics g){
    g.drawString(keymsg, 10, 40);
    g.drawString(mousemsg, mouseX, mouseY);
  }

  //create the window
  public static void main(String args[])
  {
    AppWindow appWin = new AppWindow();

    appWin.setSize(new Dimension(300, 200));
    appWin.setTitle("An AWT-basd application");
    appWin.setVisible(true);
  }
}

class MyKeyAdapter extends KeyAdapter{
  AppWindow appWindow;

  public MyKeyAdapter(AppWindow appWindow){
    this.appWindow = appWindow;
  }

  public void keyTyped(KeyEvent ke){
    appWindow.keymsg += ke.getKeyChar();
    appWindow.repaint();
  };
}

class MyMouseAdapter extends MouseAdapter {
  AppWindow appWindow;

  public MyMouseAdapter(AppWindow appWindow){
    this.appWindow = appWindow;
  }

  public void MousePressed(MouseEvent me){
    appWindow.mouseX = me.getX();
    appWindow.mouseY = me.getY();
    appWindow.mousemsg = "Mouse down at " + appWindow.mouseX + " : " + appWindow.mouseY;
    appWindow.repaint();
  }
}

class MyWindowAdapter extends WindowAdapter {
  public void windowClosing(WindowEvent we){
    System.exit(0);
  }
}
