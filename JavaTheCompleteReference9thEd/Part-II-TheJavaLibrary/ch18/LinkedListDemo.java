
import java.util.*;

class LinkedListDemo {
  public static void main(String args[])
  {
    LinkedList<String> ll = new LinkedList<String>();

    ll.add("F");
    ll.add("B");
    ll.add("D");
    ll.add("E");
    ll.add("C");
    ll.addLast("Z");
    ll.addLast("A");

    ll.add(1, "A2");

    System.out.println("Original contents of ll: " + ll);

    ll.remove("F");
    ll.remove(2);

    System.out.println("contents of ll after deletion: " + ll);

    ll.removeFirst();
    ll.removeLast();

    System.out.println("After removing first and last: " + ll);

    //get and set values
    String val = ll.get(2);
    ll.set(2, val + " changed");

    System.out.println("ll after change: " + ll);
  }
}
