

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
    boolean isPalin = isPalindrome(word);
    System.out.println(isPalin);
  }
}
