
import java.util.regex.*;

class RegExpr7 {
  public static void main(String args[])
  {
    Pattern pat = Pattern.compile("[a-z]+");
    Matcher match = pat.matcher("this is a test.");

    while(match.find())
      System.out.println("match found: " + match.group() + " at: " + match.start());
  }
}
