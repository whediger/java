
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
    Card cards = new Card[52];
    int index = 0;
    for (int suit = 0; suit<= 3; suit++){
      for (int rank = 1; rank <= 13; rank++){
        cards[index] = new Card(rank, suit);
        index++;
      }
    }
  }

  public static void printDeck(Card[] cards){
    for (int i = 0; i < cards.length; i++){
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

  public String toString(){
    String s = ranks[this.rank] + " of " + suits[this.suit];
    return s;
  }

  public int compareTo(Card that){
    if (this.suit < that.suit){
      return -1;
    }
    if (this.suit > that.suit){
      return 1;
    }
    if (this.rank < that.rank){
      return -1;
    }
    if (this.rank > that.rank){
      return 1;
    }
    return 0;
  }

  // +==]========>
  public static void main(String[] args){

  }
}
