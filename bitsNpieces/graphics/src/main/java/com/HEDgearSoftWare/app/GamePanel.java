package com.HEDgearSoftWare.app;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GamePanel extends JPanel {

  public static final int WIDTH = 640;
  public static final int HEIGHT = 480;

  public GamePanel(){
    super();

    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setFocusable(true);
    requestFocus();
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawString("Hello sanity", 10, 10);
  }

}
