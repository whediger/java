
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
