
public class Anagram {

  public static boolean anagram(String str1, String str2){

    str1 = str1.replaceAll( "[ ]+", "" );
    str2 = str2.replaceAll( "[ ]+", "" );

    if ( str1.length() != str2.length()) { return false; }
    int length = str1.length() -1;

    return letterMatch(str1, str2, length);
  }

  private static boolean letterMatch(String str1, String str2, int charCount){

    int str1length = str1.replaceAll( "[^" + str1.charAt(charCount) + "]", "" ).length();
    int str2length = str2.replaceAll( "[^" + str1.charAt(charCount) + "]", "" ).length();

    if (str1length != str2length) { return false; };
    if (charCount == 0 ) { return true; };

    charCount--;
    return letterMatch(str1, str2, charCount);
  }

  public static void main(String[] args){
    //true
    String str1 = "allen downey";
    String str2 = "well annoyed";
    //false
    String str3 = "discombobulated";
    String str4 = "well annoyeddddd";

    boolean result = anagram(str1, str2);
    System.out.println("true result: " + result);

    System.out.println("  +==]========>");

    result = anagram(str3, str4);
    System.out.println("false result: " + result);
  }
}
