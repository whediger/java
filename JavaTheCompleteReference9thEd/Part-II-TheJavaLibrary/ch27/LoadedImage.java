
import java.awt.*;

public class LoadedImage extends Canvas {
  Image img;

  public LoadedImage(Image i){
    set(i);
  }

  void set(Image i){
    MediaTracker t = new MediaTracker(this);
    t.addImage(i, 0);
    try {
      t.waitForAll();
    } catch(InterruptedException exc){
      System.out.println("Interrupted in LoadedImage - " + exc);
      return;
    }
    img = i;
    repaint();
  }

  public void paint(Graphics g) {
    if (img == null) {
      g.drawString("no image", 10, 30);
    } else {
      g.drawImage(img, 0, 0, this);
    }
  }

  public Dimension getPrefferedSize() {
    return new Dimension(img.getWidth(this), img.getHeight(this));
  }

  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
}
