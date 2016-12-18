
import java.util.*;

class PropDemo {
  public static void main(String args[])
  {
    Properties capitals = new Properties();

    capitals.put("Illinois", "Springfield");
    capitals.put("Missori", "Jefferson City");
    capitals.put("Washington", "Olympia");
    capitals.put("California", "Scrimento");
    capitals.put("Indiana", "Indianapolis");

    //get a set-view of keys
    Set<?> states = capitals.keySet();

    //show all the states and capitals
    for(Object name : states)
      System.out.println("the capital of " + name + " is " + capitals.getProperty((String)name) );

    System.out.println();

    //look for state not in list -- specify default
    String str = capitals.getProperty("FLorida", "Not Found");
    System.out.println("The capital of Florida is " + str);
  }
}
