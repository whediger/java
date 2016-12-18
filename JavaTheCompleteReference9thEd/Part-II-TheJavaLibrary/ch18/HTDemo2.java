//this version we create a set and use an iterator
import java.util.*;

class HTDemo2 {
  public static void main(String args[])
  {
    Hashtable<String, Double> ballance = new Hashtable<String, Double>();

    String str;
    double bal;

    ballance.put("John Doe", 3434.34);
    ballance.put("Tom Smith", 123.22);
    ballance.put("Jane Baker", 1378.00);
    ballance.put("Tod Hall", 99.22);
    ballance.put("Ralph Smith", -19.08);

    //show all ballances in HashTable
    //first, get a set view of the keys
    Set<String> set = ballance.keySet();

    //get an iterator
    Iterator<String> itr = set.iterator();

    while(itr.hasNext()){
      str = itr.next();
      System.out.println(str + ": " + ballance.get(str));
    }

    System.out.println();

    //deposit 1000 into John Doe's account
    bal = ballance.get("John Doe");
    ballance.put("John Doe", (bal + 1000));
    System.out.println("John Doe's new ballance: " + ballance.get("John Doe"));
  }
}
