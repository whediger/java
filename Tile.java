
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

  public String toString(){
    return String.format("%c %d", this.letter, this.value);
  }

  public boolean equals(Tile that){
    return this.letter == that.letter &&
           this.value == that.value;
  }

  public static void main(String[] args){
    Tile myTile = new Tile('A', 1);
    Tile trueTile = new Tile('A', 1);
    Tile falseLetterTile = new Tile('B', 1);
    Tile falseNumberTile = new Tile('A', 3);
    String tile = myTile.toString();
    System.out.println(tile);
    testTile();
    System.out.println("+==]========>");
    System.out.println("true: " + myTile.equals(trueTile));
    System.out.println("true: " + myTile.equals(falseLetterTile));
    System.out.println("true: " + myTile.equals(falseNumberTile));
  }
}
