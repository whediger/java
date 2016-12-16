
import java.util.*;

class ArrayDequeDemo {
  public static void main(String args[])
  {
    ArrayDeque<String> ad = new ArrayDeque<String>();

    //use array deque like a stack!
    ad.push("A");
    ad.push("B");
    ad.push("D");
    ad.push("E");
    ad.push("F");

    System.out.print("Poping the stack...");

    while(ad.peek() != null){
      System.out.print(ad.pop() + " ");
    }

    System.out.println();
  }
}
