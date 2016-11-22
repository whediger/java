
public class Card {

  public static final String[] RANKS = {
    null, "Ace", "2", "3", "4", "5", "6", "7",
    "8", "9", "10", "Jack", "Queen", "King"};
  public static final String[] SUITS = {
    "Clubs", "Diamonds", "Hearts", "Spades"};

  private int rank;
  private int suit;


  public Card(int rank, int suit){
    this.rank = rank;
    this.suit = suit;
  }

  public String toString() {
    return RANKS[this.rank] + " of " + SUITS[this.suit];
  }

  public boolean equals(Card that) {
    return this.rank == that.rank
  }

  public String toString(){
    String[] ranks = { null, "Ace", "2", "3", "4", "5", "6",
               "7", "8", "9", "10", "Jack", "Queen", "King" };
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"}
    String s = ranks[this.rank] + " of " + suits[this.suit];
    return s;
  }

  public static void main(String[] args){

  }
}
