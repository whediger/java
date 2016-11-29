import java.util.Random;


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
    Deck sub = new Deck(high - low);
    for (int i = 0; i < sub.cards.length; i++){
      sub.cards[i] = this.cards[i + low];
    }
    return sub;
  }

  public void selectionSort() {
    Card temp;
    for (int i = 0; i < this.cards.length; i++){
      for (int j = (i + 1); j < (this.cards.length); j++){
          if (this.cards[j].compareTo(this.cards[i]) == 1) {
            temp = this.cards[i];
            this.cards[i] = this.cards[j];
            this.cards[j] = temp;
          }
      }

    }
  }
  //helper for mergeSort
  // public Deck subDeck(int low, int high){
    //Note: cards in subDeck are aliased and subject to changes in the Deck
  //   Deck sub = new Deck(high - low +1);
  //   for (int i = 0; i < sub.cards.length; i++) {
  //     sub.cards[i] = this.cards[low + 1];
  //   }
  //   return sub;
  // }

  //helper for mergeSort
  public static Deck merge(Deck d1, Deck d2){
    // create new deck large enough for all cards
    Deck result = new Deck(52);

    // use index i to keep track of where we are in first deck
    int i = 0;
    // use index j for the second deck
    int j = 0;

    //index k traverses the result deck
    for (int k = 0; k < result.cards.length; k++) {
      if (i == (d1.cards.length)){
        result.cards[k] = d2.cards[j];
        j++;
      } else if (j == (d2.cards.length)) {
        result.cards[k] = d1.cards[i];
        i++;
      } else {
          if (d1.cards[i].compareTo(d2.cards[j]) == 1){
            result.cards[k] = d1.cards[i];
            i++;
          } else {
            result.cards[k] = d2.cards[j];
            j++;
          }
      }
    }
    return result;
  }

  public Deck almostMergeSort(){
    // !almost because it uses the selectionSort method!
    // divide the deck into two subdecks;
    // sort the deck using selectionSort
    // merge the two halfs and return the result

    Deck result = new Deck();
    int firstHalf = this.cards.length / 2;
    Deck halfOne = this.subDeck(0, firstHalf);
    Deck halfTwo = this.subDeck(firstHalf, this.cards.length);
    halfOne.selectionSort();
    halfTwo.selectionSort();
    result = merge(halfOne, halfTwo);
    return result;
  }

  //public Deck mergeSort(){
    //if the deck is 0 or 1 cards return it
    //divide the deck into two subdecks
    // sort the subdecks using mergeSort
    //merge the two hals and return the result
  //}

  //deck shuffle methods +==]========>
  public static int randomInt(int low, int high){
    Random rand = new Random();
    return low + rand.nextInt(high - low + 1); // +1 to be inclusive of high value
  }

  public void shuffle() {
    Card temp;
    for (int i = 0; i < this.cards.length; i++){
      int rand = randomInt(1, (this.cards.length - 1));
      temp = this.cards[rand];
      this.cards[rand] = this.cards[i];
      this.cards[i] = temp;
    }
  }
}
