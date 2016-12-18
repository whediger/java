
import java.util.*;

class HashMapDemo {
  public static void main(String args[])
  {
    //create a hashmap
    HashMap<String, Double> hm = new HashMap<String, Double>();

    hm.put("John Doe", new Double(3434.34));
    hm.put("Tom Smith", new Double(123.33));
    hm.put("Jane Baker", new Double(1378.00));
    hm.put("Tod Hall", new Double(99.22));
    hm.put("Ralph Smith", new Double(-19.08));


    //get set of entries
    Set<Map.Entry<String, Double>> set = hm.entrySet();

    //display set
    for (Map.Entry<String, Double> me : set) {
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }

    System.out.println();

    //deposit 1000 into John Doe's account
    double ballance = hm.get("John Doe");
    hm.put("John Doe", (ballance + 1000));

    System.out.println("John Doe's new ballance: " + hm.get("John Doe"));
  }
}
