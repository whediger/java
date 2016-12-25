
import java.util.*;
import java.util.stream.*;

class StreamDemo10 {
  public static void main(String args[])
  {
    ArrayList<String> myList = new ArrayList<String>();

    myList.add("alpha");
    myList.add("beta");
    myList.add("charlie");
    myList.add("delta");
    myList.add("echo");
    myList.add("foxtrot");

    Stream<String> myStream = myList.stream();

    Spliterator<String> mySplit = myStream.spliterator();

    Spliterator<String> mySplit2 = mySplit.trySplit();

    //if mySplit could be split
    if(mySplit2 != null){
      System.out.println("output from mySplit2: ");
      mySplit2.forEachRemaining( (n) -> System.out.println(n));
    }

    //use orignal spliterator
    System.out.println("\nOutput from spliterator: ");
    mySplit.forEachRemaining( (n) -> System.out.println(n));
  }
}
