
import java.util.regex.*;

class RegExpr8 {
  public static void main(String args[])
  {
    String str = "Jon Jonathan Frank Ken Todd";

    Pattern pat = Pattern.compile("Jon.*? ");
    Matcher match = pat.matcher(str);

    System.out.println("Original sequence: " + str);

    //---uses the predefined pattern to decide what to replace
    str = match.replaceAll("Eric ");

    System.out.println("Modified sequence: " + str);
  }
}
