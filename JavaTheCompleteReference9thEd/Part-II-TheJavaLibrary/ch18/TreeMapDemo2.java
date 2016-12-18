
import java.util.*;

//compare last whole words in 2 strings
class TComp implements Comparator<String> {
  public int compare(String aStr, String bStr){
    int i, j, k;

    //find index of begining last name
    i = aStr.lastIndexOf(' ');
    j = bStr.lastIndexOf(' ');

    k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));

    if(k == 0)//substrings match, check whole name
      return aStr.compareToIgnoreCase(bStr);
    else
      return k;
  }
  //no need to override equals
}

class TreeMapDemo2 {
  public static void main(String args[])
  {
    //create a TreeMap
    TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

    tm.put("John Doe", new Double(3434.34));
    tm.put("Tom Smith", new Double(123.33));
    tm.put("Jane Baker", new Double(1378.00));
    tm.put("Tod Hall", new Double(99.22));
    tm.put("Ralph Smith", new Double(-19.08));

    //get a set of entries
    Set<Map.Entry<String, Double>> set = tm.entrySet();

    //display the set
    for(Map.Entry<String, Double> entry : set)
      System.out.println(entry.getKey() + ": " + entry.getValue());

    System.out.println();

    //depost 1000 into John Doe's account
    double ballance = tm.get("John Doe");
    tm.put("John Doe", (ballance + 1000));

    System.out.println("John Does new ballance: " + tm.get("John Doe"));
  }

}
