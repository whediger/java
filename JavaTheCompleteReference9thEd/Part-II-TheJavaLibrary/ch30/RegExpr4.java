
import java.util.regex.*;

class RegExpr4 {
  public static void main(String args[])
  {
    Pattern pat = Pattern.compile("W+");
    Matcher match = pat.matcher("WW WWW WWIWW W W");

    while(match.find())
      System.out.println("match 'W' found at index: " + match.group() + " : " + match.start());
  }
}
