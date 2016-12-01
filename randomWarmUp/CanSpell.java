
public class CanSpell {

  public static boolean canSpell(String tiles, String word){

    if (word.length() > tiles.length()) { return false; }
    int charLength = word.length() -1;

    return tileCheck(tiles, word, charLength);
  }

  private static boolean tileCheck(String tiles, String word, int wordLength){

    int tilesCount = tiles.replaceAll( "[^" + word.charAt(wordLength) + "]", "" ).length();

    if (tilesCount == 0) { return false; };
    if (wordLength == 0) { return true; };

    wordLength--;
    return tileCheck(tiles, word, wordLength);
  }

  public static void main(String[] args){

    String tiles = "quijibo";
    String word = "jib";

    boolean result = canSpell(tiles, word);
    System.out.println(result);

  }
}
