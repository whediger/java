import java.util.ArrayList;
import java.util.Random;

public class CardCollection {

  private String label;
  private ArrayList<Card> cards;

  // +==]========>

  private CardCollection(String label){
    this.label = label;
    this.cards = new ArrayList<Card>();
  }

  // +==]========>

  public Card getCard(int i){
    return cards.get(i);
  }

  public String getLabel(){
    return this.label;
  }

  // +==]========>

  public void addCard(Card card){
    cards.add(card);
  }

  public Card popCard(int i){
    return cards.remove(i);
  }

  public Card popCard() {
    int i = size() -1;
    return popCard(i);
  }

  //gets last card without removing it
  public Card last(){
    int i = size() -1;
    return cards.get(i);
  }

  public int size(){
    return cards.size();
  }

  public boolean empty() {
    return cards.size() == 0;
  }

  public void deal(CardCollection that, int n){
    for (int i =0; i < n; i++) {
      Card card = popCard();
      that.addCard(card);
    }
  }

  public void dealAll(CardCollection that){
    for (int i = 0; i < that.size(); i++) {
      Card card = popCard();
      that.addCard(card);
    }
  }

  public void swapCards(int i, int j){
    Card temp = cards.get(i);
    cards.set(i, cards.get(j));
    cards.set(j, temp);
  }

  public void shuffle(){
    Random rand = new Random();
    for (int i = size() -1; i > 0; i--){
      int j = rand.nextInt(i);
      swapCards(i, j);
    }
  }

  public class Deck extends CardCollection {

    public Deck(String label){
      super(label);

      for (int suit = 0; suit <=3; suit++) {
        for (int rank = 1; rank <= 13; rank++) {
          cards.add(new Card(rank, suit));
        }
      }
    }
  }

  public class Hand extends CardCollection {

    public Hand(String label){
      super(label);
    }

    public void display() {
      System.out.println(getLabel() + ": ");
      for (int i = 0; i < size(); i++) {
        System.out.println(getCard(i));
      }
      System.out.println();
    }
  }

  public class Player {

    private String name;
    private Hand hand;

    public Player(Strig name){
      this.name = name;
      this.hand = new Hand(name);
    }

    public Card play(Eights eights, Card prev){
      Card card  = searchForMatch(prev);
      if (card == null) {
        card = drawMatch(eights, prev);
      }
      return card;
    }

    public Card searchForMatch(Card prev){
      for (int i = 0; i < hand.size(); i++) {
        Card card = hand.getCard(i);
        if (cardMatches(card, prev)) {
          return hand.popCard(i);
        }
      }
      return null;
    }

    public Card drawForMatch(Eights eights, Card prev){
      while (true){
        Card card = eights.draw();
        System.out.println(name + " draws " + card);
        if (cardMatches(card, prev)) {
          return card;
        }
        hand.addCard(card);
      }
    }

    public static boolean cardMatches(Card card1, Card card2) {
      if (card1.getSuit() == card2.getSuit()) {
        return true;
      }
      if (card1.getRank() == card2,getRank()) {
        return true;
      }
      if (card1.getRank() ==8 ) {
        return true;
      }
      return false;
    }
  }

  public static void main(String[] args){

    Deck deck = new Deck("Deck");
    deck.shuffle();

    Hand hand = new Hand("Hand");
    deck.deal(hand, 5);
    hand.display();

    Hand drawPile = new Hand("Draw Pile");
    deck.dealAll(drawPile);
    System.out.printf("Draw pile has %d cards. \n", drawPile.size());
  }
}
