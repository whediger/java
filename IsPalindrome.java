

public class IsPalindrome {

  public static boolean isPalindrome(String word){
    int charCount = ((word.length() - (word.length() % 2))/2);
    return isPalindrome(word, charCount);
  }

  private static boolean isPalindrome(String word, int charCount){

    if ( word.charAt(word.length() - charCount -1) != word.charAt(charCount)){
      return false;
    }
    if (charCount == 0 ){
      return true;
    }
    charCount--;
    return isPalindrome(word, charCount);
  }

  public static void main(String[] args){
    String word = "palindromeemordnilap";
    String letter = "p";
    String notP = "slfk";

    System.out.println("word");
    boolean isPalin = isPalindrome(word);
    System.out.println(isPalin);

    System.out.println("letter");
    isPalin = isPalindrome(letter);
    System.out.println(isPalin);

    System.out.println("notP");
    isPalin = isPalindrome(notP);
    System.out.println(isPalin);
  }
}
