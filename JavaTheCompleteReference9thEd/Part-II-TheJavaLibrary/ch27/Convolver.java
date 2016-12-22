
import java.applet.*;
import java.awt.*;
import java.awt.image.*;

abstract class Convolver implements ImageConsumer, PlugInFilter {
  int width, height;
  int imgPixels[], newImagePixels[];
  boolean imageReady = false;

  abstract void convolve(); //filter goes here

  public Image filter(Applet a, Image in){
    imageReady = false;
    in.getSource().startProduction(this);

    waitForImage();
    newImagePixels = new int[width*height];

    try {
      convolve();
    } catch(Exception exc){
      System.out.println("Error: convolver failed - +==]========>");
      exc.printStackTrace();
    }
    return a.createImage(
      new MemoryImageSource(width, height, newImagePixels, 0, width));
  }

  synchronized void waitForImage(){
    try{
      while(!imageReady) wait();
    } catch(Exception exc){
      System.out.println("Error: Interrupted - " + exc);
    }
  }

  public void setProperties(java.util.Hashtable <?, ?> dummy) { }
  public void setColorModel(ColorModel dummy) { }
  public void setHints(int dummy) { }

  public synchronized void imageComplete(int dummy){
    imageReady = true;
    notifyAll();
  }

  public void setDemensions(int x, int y){
    width = x;
    height = y;
    imgPixels = new int[x * y];
  }

  public void setPixels(int x1, int y1, int w, int h, ColorModel model
                              , byte pixels[], int off, int scansize) {
    int pix, x, y, x2, y2, sx, sy;

    x2 = x1+w;
    y2 = y1+h;
    sy = off;
    for (y = y1; y < y2; y++) {
      sx = sy;
      for (x = x1; x < x2; x++) {
        pix = model.getRGB(pixels[sx++]);
        if((pix &0xff000000) == 0)
          pix = 0x00ffffff;
        imgPixels[y*width+x] = pix;
      }
      sy += scansize;
    }
  }

  public void setPixels(int x1, int y1, int w, int h, ColorModel model,
                                        int pixels[], int off, int scansize)
  {
    int pix, x, y, x2, y2, sx, sy;

    x2 = x1 + w;
    y2 = y1 + h;
    sy = off;
    for (y = y1; y < y2; y++) {
      sx = sy;
      for (x = x1; x < x2; x++) {
        pix = model.getRGB(pixels[sx++]);
        if((pix & 0xff000000) == 0)
          pix = 0x00ffffff;
        imgPixels[y*width+x] = pix;
      }
      sy += scansize;
    }
  }


}
