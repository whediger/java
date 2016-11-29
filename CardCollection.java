import java.util.ArrayList;


public class CardCollection {

  private String label;
  private ArrayList<Card> cards;

  // +==]========>

  private CardCollection(String label){
    this.label = lable;
    this.cards = new ArrayList<Card>();
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
}
