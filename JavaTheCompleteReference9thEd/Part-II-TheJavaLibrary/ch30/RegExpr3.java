
import java.util.regex.*;

class RegExpr3 {
  public static void main(String args[])
  {
    Pattern pat = Pattern.compile("test");
    Matcher match = pat.matcher("test 1 2 3 test");

    while(match.find()){
      System.out.println("Test found at index " + match.start());
    }
  }
}
