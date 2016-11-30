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

    public Player(String name){
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
      if (card1.getRank() == card2.getRank()) {
        return true;
      }
      if (card1.getRank() ==8 ) {
        return true;
      }
      return false;
    }

    public int score() {
      int sum = 0;
      for (int i = 0; i <hand.size(); i++) {
        Card card = hand.getCard(i);
        int rank = card.getRank();
        if (rank == 8) {
          sum -= 20;
        } else if (rank > 10) {
          sum -= 10;
        } else {
          sum -= rank;
        }
      }
      return sum;
    }
  }//Player class

  public class Eights {

    private Player one;
    private Player two;
    private Hand drawPile;
    private Hand discardPile;
    private Scanner in;

    public Eights(){
      Deck deck = new Deck("Deck");
      deck.shuffle();

      int handSize = 5;
      one = new Player("Allen");
      deck.deal(one.getHand(), handSize);

      two = new Player("Chris");
      deck.deal(one.getHand(), handSize);

      discardPile = new Hand("Discards");
      deck.deal(discardPile, 1);

      drawPile = new Hand("Draw Pile");
      deck.dealAll(drawPile);

      in = new Scanner(System.in);
    }

    public boolean isDone(){
      return one.getHand().empty() || two.getHand().empty();
    }

    public class reshuffle() {
      Card prev = discardPile.popCard();
      discardPile.dealAll(drawPile);
      discardPile.addCard(prev);
      drawPile.shuffle();
    }

    public Card draw() {
      if (drawPile.empty()) {
        reshuffle();
      }
      return drawPile.popCard();
    }

    public Player nextPlayer(Player current){
      if (current == one) {
        return two;
      } else {
        return one;
      }
    }

    public void displayState() {
      one.display();
      two.display();
      discardPile.display();
      System.out.println("Draw pile:");
      System.out.println(drawPile.size() + " cards");
    }

    public void waitForUser() {
      in.nextLine();
    }

    public void takeTurn(Player player){
      Card prev = discardPile.last();
      Card next = player.play(this, prev);
      discardPile.addCard(next);

      System.out.println(player.getName() + " plays " + next);
      System.out.println();
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
