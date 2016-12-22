
/*
*   <applet code=ImageFilterDemo height=345 width=400>
*   <param name=img value=Lilies.jpg>
*   <param name=filters value="Greyscale+Invert+Contrast+Blur+Sharpen">
*   </applet>
*/

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.applet.*;


public class ImageFilterDemo extends Applet implements ActionListener {
  Image img;
  PlugInFilter pif;
  Image fimg;
  Image curImg;
  LoadedImage lim;
  Label lab;
  Button reset;

  public void init() {
    setLayout(new BorderLayout());
    Panel p = new Panel();
    reset = new Button("reset");
    reset.addActionListener(this);
    p.add(reset);
    StringTokenizer st = new StringTokenizer(getParameter("filters"), "+");

    while(st.hasMoreTokens()) {
      Button b = new Button(st.nextToken());
      b.addActionListener(this);
      p.add(b);
    }

    lab = new Label("");
    add(lab, BorderLayout.NORTH);

    img = getImage(getDocumentBase(), getParameter("img"));
    lim = new LoadedImage(img);
    add(lim, BorderLayout.CENTER);
  }

  @Override
  public void actionPerformed(ActionEvent ae) {
    String a = "";

    try {
      a = ae.getActionCommand();
      if(a.equals("reset")){
        lim.set(img);
        lab.setText("Normal");
      } else {
        pif = (PlugInFilter)Class.forName(a).newInstance();
        fimg = pif.filter(this, img);
        lim.set(fimg);
        lab.setText("Filtered: " + a);
      }
      repaint();
    } catch(ClassNotFoundException exc){
      lab.setText("Error: " + a + " not found - " + exc);
      lim.set(img);
      repaint();
    } catch(InstantiationException exc) {
      lab.setText("Error: Couldn't new " + a);
    } catch(IllegalAccessException exc){
      lab.setText("Error: No access - " + a);
    }
  }
}
//   +==]========>

interface PlugInFilter {
  java.awt.Image filter(java.applet.Applet a, java.awt.Image in);
}

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

class GreyScale extends RGBImageFiler implements PlugInFilter {
  public Image filter(Applet a, Image in) {
    return a.createImage(new FilteredImageSource(in.getSource(), this));
  }

  public int filterRGB(int x, int y, int rgb){
    int r = (rgb >> 16) & 0xff;
    int g = (rgb >> 8) & 0xff;
    int b = rgb & 0xff;
    int k = (int)(.56 * g + .33 * r + .11 * b);
    return (0xff000000 | k << 16 | k << 8 | k);
  }

}
