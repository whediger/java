
public class Card {

  public static final String[] RANKS = {
    null, "Ace", "2", "3", "4", "5", "6", "7",
    "8", "9", "10", "Jack", "Queen", "King"};
  public static final String[] SUITS = {
    "Clubs", "Diamonds", "Hearts", "Spades"};

  private final int rank;
  private final int suit;

  // +==]========>
  public Card(int rank, int suit){
    this.rank = rank;
    this.suit = suit;
  }

  // +==]========>
  public int getRank(){
    return this.rank;
  }

  public int getSuit(){
    return this.suit;
  }

  public Card[] makeDeck(){
    Card[] cards = new Card[52];
    int index = 0;
    for (int suit = 0; suit<= 3; suit++){
      for (int rank = 1; rank <= 13; rank++){
        cards[index] = new Card(rank, suit);
        index++;
      }
    }
    return cards;
  }

  public static void printDeck(Card[] cards){
    for (int i = 0; i < cards.length; i++){
      if (i % 13 == 0){ System.out.println("               +==]========>");};
      System.out.println(cards[i]);
    }
  }

  public String toString() {
    return RANKS[this.rank] + " of " + SUITS[this.suit];
  }

  public boolean equals(Card that) {
    return this.rank == that.rank
      && this.suit == that.suit;
  }

  public int compareTo(Card that){
    if (this.suit < that.suit){
      return -1;
    }
    if (this.suit > that.suit){
      return 1;
    }
    //&& this.rank != 1 for games where Ace is high
    if (this.rank < that.rank && this.rank != 1){
      return -1;
    }
    //&& that.rank != 1 for games where Ace is high
    if (this.rank > that.rank && that.rank != 1){
      return 1;
    }
    return 0;
  }

  public static int[] suitHist(Card[] cards){
    int[] suitH = new int[cards.length];
    for ( int i = 0; i < cards.length; i++){
      suitH[i] = cards[i].suit;
    }
    return suitH;
  }

  public static boolean hasFlush(int[] cards){
    int baseCard = cards[0];
    for (int card : cards){
      if (card != baseCard){ return false; };
    }
    return true;
  }


  // +==]========>
  public static void main(String[] args){
    Card[] deck = new Card[52];
    Card card = new Card(2,3);
    deck = card.makeDeck();
    card.printDeck(deck);
    Card card1 = new Card(1,3);
    Card card2 = new Card(2,3);
    Card[] cards = { card, card1, card2 };
    int[] suits = suitHist(cards);
    for (int i= 0; i < suits.length; i++){
      System.out.println(suits[i]);
    }
    System.out.println(hasFlush(suits));
  }
}
