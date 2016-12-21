
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
  <applet code="CardLayoutDemo" height=100 width=400></applet>
*/

public class CardLayoutDemo extends Applet implements ActionListener, MouseListener {
  Checkbox windowsXP, windows7, windows8, android, solaris, mac;
  Panel osCards;
  CardLayout cardLO;
  Button Win, Other;

  public void init(){
    Win = new Button("Windows");
    Other = new Button("Other");
    add(Win);
    add(Other);

    cardLO = new CardLayout();
    osCards = new Panel();
    osCards.setLayout(cardLO);

    windowsXP = new Checkbox("Windows XP", null, true);
    windows7 = new Checkbox("Windows 7", null, false);
    windows8 = new Checkbox("Windows 8", null, false);
    android = new Checkbox("Andriod");
    solaris = new Checkbox("Solaris");
    mac = new Checkbox("Mac");

    //add iwndows checkboxes to pannel
    Panel winPan = new Panel();
    winPan.add(windowsXP);
    winPan.add(windows7);
    winPan.add(windows8);

    //add other os boxes to Panel
    Panel otherPan = new Panel();
    otherPan.add(android);
    otherPan.add(solaris);
    otherPan.add(mac);

    //add panels to card deck panel
    osCards.add(winPan, "Windows");
    osCards.add(otherPan, "Other");

    //add cars to main applet pannel
    add(osCards);

    //register for Events
    Win.addActionListener(this);
    Other.addActionListener(this);

    //register mouse Events
    addMouseListener(this);
  }

  //cycle through panels
  @Override
  public void mousePressed(MouseEvent me){
    cardLO.next(osCards);
  }

  @Override
  public void mouseClicked(MouseEvent me){}
  @Override
  public void mouseEntered(MouseEvent me){}
  @Override
  public void mouseExited(MouseEvent me){}
  @Override
  public void mouseReleased(MouseEvent me){}

  @Override
  public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == Win)
      cardLO.show(osCards, "Windows");
    else
      cardLO.show(osCards, "Other");
  }
}
