
import java.util.regex.*;

class RegExpr2 {
  public static void main(String args[])
  {
    Pattern pat = Pattern.compile("Java");
    Matcher match = pat.matcher("Java 8");

    System.out.println("Looking for Java in 'Java 8'");

    if(match.find()) System.out.println("Java was found in 'Java 8'");
    else System.out.println("pattern was found");
  }
}
