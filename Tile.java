
public class Tile {

  char letter;
  int value;

  public Tile(char letter, int value){
    this.letter = letter;
     this.value = value;
  }

  public static void printTile(Tile thisTile){
    System.out.print("This tile: '" + thisTile.letter + "' value: " + thisTile.value);
  }

  public static void main(String[] args){

    Tile myTile = new Tile('a', 1);
    printTile(myTile);

  }
}
