
public class Deck {

  private Card[] cards;

  public Deck(int n){
      this.cards = new Card[n];
  }

  public Deck(){
    this.cards = new Card[52];
    int index = 0;
    for (int suit = 0; suit <=3; suit++){
      for (int rank = 1; rank <= 13; rank++) {
        this.cards[index] = new Card(rank, suit);
        index++;
      }
    }
  }

  public void print() {
    for (int i = 0; i < this.cards.length; i++){
      System.out.println(this.cards[i].toString());
    }
  }

  public Deck subDeck(int low, int high){
    Deck sub = new Deck(high - low -1);
    for (int i = 0; i < sub.cards.length; i++){
      sub.cards[i] = this.cards[low +1];
    }
    return sub;
  }

  public void selectionSort() {
    for each index i{
      //find lowset card at or to to the right of i
      //swap the ith card and lowest card found
    }
  }
  //helper for mergeSort
  public Deck subDeck(int low, int high){
    //Note: cards in subDeck are aliased and subject to changes in the Deck
    Deck sub = new Deck(high - low +1);
    for (int i = 0; i < sub.cards.length; i++) {
      sub.cards[i] = this.cards[low + 1];
    }
    return sub;
  }
  //helper for mergeSort
  public static Deck merge(Deck d1, Deck d2){
    //create new deck large enough for all cards

    //use index i to keep ttrack of where we are in first deck
    //use index j for the second deck
    int i = 0;
    int j = 0;
    //index j traverses the result deck
    for (int k = 0; k < result.cards.length; k++) {
      //if d1 is empty d2 wins
      //if d2 is empty d1 wins
      //else compare 2 cards

      //add winner to result deck at position k
      //increment either i or j(d1 or d2)
    }
  }
}
