
import java.util.*;

class SpliteratorDemo {
  public static void main(String args[])
  {
    ArrayList<Double> vals = new ArrayList<>();

    vals.add(1.0);
    vals.add(2.0);
    vals.add(3.0);
    vals.add(4.0);
    vals.add(5.0);

    //use tryAdvance() to display vals
    System.out.println("contents of vals: " + vals);
    Spliterator<Double> sp = vals.spliterator();
    while(sp.tryAdvance((n) -> System.out.println(n)));
    System.out.println();

    //create new list that contains squareroots
    sp = vals.spliterator();
    ArrayList<Double> sqrs = new ArrayList<>();
    while(sp.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

    System.out.println("contents of squares - ");
    sp = sqrs.spliterator();
    sp.forEachRemaining((n) -> System.out.println(n));
    System.out.println();
  }
}
