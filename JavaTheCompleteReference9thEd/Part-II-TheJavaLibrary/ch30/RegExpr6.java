
import java.util.regex.*;

class RegExpr6 {
  public static void main(String args[])
  {
    //using reluctant matching behaviour
    Pattern pat = Pattern.compile("e.+?d");
    Matcher match = pat.matcher("extend cup end table");

    while(match.find()) System.out.println("match found: " + match.group() + " at: " + match.start());
  }
}
