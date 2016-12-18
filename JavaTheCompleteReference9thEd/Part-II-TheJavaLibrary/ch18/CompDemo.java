
import java.util.*;

//a reverse comparitor for strings
class MyComp implements Comparator<String> {
  public int compare(String aStr, String bStr){
    //reverse the comparison
    return bStr.compareTo(aStr);
  }
  //no need to override equals or default methods
}

class CompDemo {
  public static void main(String args[])
  {
    //create a TreeSet
    TreeSet<String> ts = new TreeSet<String>(new MyComp());

    ts.add("C");
    ts.add("A");
    ts.add("B");
    ts.add("E");
    ts.add("F");
    ts.add("D");

    // display the elements
    for(String element : ts)
      System.out.print(element + ", ");

    System.out.println();  
  }
}
