
import java.util.*;

//a comparitor that compares to last names
class CompLastNames implements Comparator<String> {
  public int compare(String aStr, String bStr){
    int i, j;

    //find index of beginning of last name;
    i = aStr.lastIndexOf(' ');
    j = bStr.lastIndexOf(' ');

    return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
  }
}
//sort by entire last name when first letters are equal
class CompThenByFirstName implements Comparator<String>{
  public int compare(String aStr, String bStr){
    int i, j;

    return aStr.compareToIgnoreCase(bStr);
  }
}


class TreeMapDemo2A {
  public static void main(String args[])
  {
    //use then comparing to compare names. compare first letters first and then first
    //names if the first letters match
    CompLastNames compLN = new CompLastNames();
    Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

    TreeMap<String, Double> tm = new TreeMap<String, Double>(compLastThenFirst);

    tm.put("John Doe", new Double(3434.34));
    tm.put("Tom Smith", new Double(123.33));
    tm.put("Jane Baker", new Double(1378.00));
    tm.put("Tod Hall", new Double(99.22));
    tm.put("Ralph Smith", new Double(-19.08));

    //get a set of entries
    Set<Map.Entry<String, Double>> set = tm.entrySet();

    //display the set
    for(Map.Entry<String, Double> me : set)
      System.out.println(me.getKey() + ": " + me.getValue());

    System.out.println();

    //deposit 1000 into John Doe's account
    double ballance = tm.get("John Doe");
    tm.put("John Doe", (ballance + 1000));

    System.out.println("John Doe's new ballance: " + tm.get("John Doe"));
  }
}
