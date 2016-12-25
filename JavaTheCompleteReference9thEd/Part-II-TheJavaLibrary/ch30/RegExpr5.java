
import java.util.regex.*;

class RegExpr5 {
  public static void main(String args[])
  {
    Pattern pat = Pattern.compile("e.+d");
    Matcher match = pat.matcher("extend cup end table");

    while(match.find())
      System.out.println("match found: " + match.group() + " | at: " + match.start());
  }
}

//+==]========>
//Note: suprising result! It only returns the longest found string of chars by default!!
