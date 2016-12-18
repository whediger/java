
import java.util.*;

class HTDemo {
  public static void main(String args[])
  {
    Hashtable<String, Double> ballance = new Hashtable<String, Double>();

    Enumeration<String> names;
    String str;
    double bal;

    ballance.put("John Doe", 3434.34);
    ballance.put("Tom Smith", 123.22);
    ballance.put("Jane Baker", 1378.00);
    ballance.put("Tod Hall", 99.22);
    ballance.put("Ralph Smith", -19.08);

    //show all ballances in HashTable
    names = ballance.keys();
    while(names.hasMoreElements()){
      str = names.nextElement();
      System.out.println(str + ": " + ballance.get(str));
    }

    //deposit 1000 into John Doe's account
    bal = ballance.get("John Doe");
    ballance.put("John Doe", (bal + 1000));
    System.out.println("John doe's new ballance: " + ballance.get("John Doe"));

  }
}
