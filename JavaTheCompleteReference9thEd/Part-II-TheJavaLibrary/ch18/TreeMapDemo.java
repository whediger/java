
import java.util.*;

class TreeMapDemo {
  public static void main(String args[])
  {
    TreeMap<String, Double> tm = new TreeMap<String, Double>();

    tm.put("John Doe", new Double(3434.34));
    tm.put("Tom Smith", new Double(123.33));
    tm.put("Jane Baker", new Double(1378.00));
    tm.put("Tod Hall", new Double(99.22));
    tm.put("Ralph Smith", new Double(-19.08));

    //get a set of the entries
    Set<Map.Entry<String, Double>> set = tm.entrySet();

    //display the elements
    for(Map.Entry<String, Double> me : set) {
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }
    System.out.println();

    //deposit 1000 into John Doe's account
    double ballance = tm.get("John Doe");
    tm.put("John Doe", (ballance + 1000));

    System.out.print("John Doe's ballance: ");
    System.out.println(tm.get("John Doe"));
  }
}
