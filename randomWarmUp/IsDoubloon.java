
public class IsDoubloon {


  public static boolean isDoubloon(String word){

    if (word.length() % 2 != 0) { return false; };

    word = word.toLowerCase();
    int wordLength = (word.length()/2) -1;

    return isDoubloon(word, wordLength);
  }

  private static boolean isDoubloon(String word, int charCount){

    int count = word.replaceAll( "[^" + word.charAt(charCount) + "]", "" ).length();

    if ( count != 2 ) { return false; };
    if ( charCount == 0 ) { return true; };

    charCount--;
    return isDoubloon(word, charCount);
  }

  public static void main(String[] args){

    //false
    String word1 = "Abba";
    boolean result = isDoubloon(word1);
    System.out.println(result);
    //false
    String word2= "appalling";
    result = isDoubloon(word2);
    System.out.println(result);
    //false
    String word3 = "Caucccasus";
    result = isDoubloon(word3);
    System.out.println(result);
    //true
    String word4 = "Shanghaiings";
    result = isDoubloon(word4);
    System.out.println(result);
    //true
    String word5 = "Emmett";
    result = isDoubloon(word5);
    System.out.println(result);
    //true
    String word6 = "intestines";
    result = isDoubloon(word6);
    System.out.println(result);
    //true
    String word7 = "Mimi";
    result = isDoubloon(word7);
    System.out.println(result);
    //true
  }
}
