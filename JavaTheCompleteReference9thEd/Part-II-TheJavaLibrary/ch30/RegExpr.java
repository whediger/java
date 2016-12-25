
import java.util.regex.*;

class RegExpr {
  public static void main(String args[])
  {
    Pattern pat;
    Matcher mat;
    boolean found;

    pat = Pattern.compile("Java");
    mat = pat.matcher("Java");
    found = mat.matches(); //check for a match

    System.out.println("testing Java against Java");
    if(found) System.out.println("it matches!!");
    else System.out.println("it does not match :p");
  }
}
