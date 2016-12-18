
import java.util.*;

class CompDemo2 {
  public static void main(String args[])
  {
    //pass reverse comaritor via a lambda expression
    TreeSet<String> ts = new TreeSet<String>((String aStr, String bStr) -> aStr.compareTo(bStr));

    ts.add("C");
    ts.add("A");
    ts.add("B");
    ts.add("E");
    ts.add("F");
    ts.add("D");

    //display elements
    for(String s : ts) System.out.println(s + " ");
    System.out.println();
  }
}
