
import java.util.*;

class VectorDemo {
  public static void main(String args[])
  {
    //intial size is 3, increments 2
    Vector<Integer> v = new Vector<Integer>(3, 2);

    System.out.println("Initial size: " + v.size());
    System.out.println("Initial capacity: " + v.capacity());

    v.addElement(1);
    v.addElement(2);
    v.addElement(3);
    v.addElement(4);

    System.out.println("Capacity after additions: " + v.capacity());

    v.addElement(5);
    System.out.println("current capacity: " + v.capacity());

    v.addElement(6);
    v.addElement(7);
    System.out.println("current capacity: " + v.capacity());

    v.addElement(9);
    v.addElement(10);
    System.out.println("current capacity: " + v.capacity());

    v.addElement(11);
    v.addElement(12);

    System.out.println("First element: " + v.firstElement());
    System.out.println("Last element: " + v.lastElement());

    if(v.contains(3))
      System.out.println("v contains 3");

    //enumerate elements in the Vector
    Enumeration<Integer> en = v.elements();

    System.out.println("\nElements in vector: ");
    while(en.hasMoreElements())
      System.out.println(en.nextElement() + " ");

    System.out.println();
  }
}
