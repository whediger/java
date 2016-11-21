
public class Tile {

  char letter;
  int value;

  public Tile(char letter, int value){
    this.letter = letter;
     this.value = value;
  }

  public static void printTile(Tile thisTile){
    System.out.print("This tile: '" + thisTile.letter + "' value: " + thisTile.value);
    System.out.println("");
  }

  public static void testTile(){
    Tile testT = new Tile('Z', 10);
    printTile(testT);
  }

  public static void main(String[] args){
    Tile myTile = new Tile('A', 1);
    printTile(myTile);
    testTile();
  }
}
