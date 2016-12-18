
import java.util.*;

class AlgorithmsDemo {
  public static void main(String args[])
  {
    //create and initialize a LinkedList
    LinkedList<Integer> ll = new LinkedList<Integer>();

    ll.add(-8);
    ll.add(20);
    ll.add(-20);
    ll.add(8);

    //create a reversed order comparitor
    Comparator<Integer> r = Collections.reverseOrder();

    //sort list by using the Comparator
    Collections.sort(ll, r);

    System.out.print("ll in reversed order: ");
    for(int i : ll)
      System.out.print( i + " ");

    System.out.println();

    //shuffle ll
    Collections.shuffle(ll);

    //display randomized list
    System.out.print("randomized ll: ");
    for(int i : ll)
      System.out.print(i + " ");

    System.out.println();

    System.out.println("Minimum: " + Collections.min(ll));
    System.out.println("Maximum: " + Collections.max(ll));
  }
}
