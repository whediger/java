
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
  <applet code="BorderLayoutDemo" height=200 width=400></applet>
*/

public class BorderLayoutDemo extends Applet {
  public void init(){
    setLayout(new BorderLayout());

    add(new Button("this is accross the top"), BorderLayout.NORTH);
    add(new Label("footer message might go here"), BorderLayout.SOUTH);
    add(new Button("Right"), BorderLayout.EAST);
    add(new Button("Left"), BorderLayout.WEST);

    String msg = "The reasonable person adapts\nthemself to the world\n" +
                "the unreasonable person trys to\nadapt the world to themself.\n" +
                "therefore all progress depends on\nthe unreasonable person.\n\n" +
                "               -- George Bernard Shaw\n\n";
    add(new TextArea(msg), BorderLayout.CENTER);
  }
}
