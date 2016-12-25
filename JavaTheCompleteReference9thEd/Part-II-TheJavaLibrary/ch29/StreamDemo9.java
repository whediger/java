
import java.util.*;
import java.util.stream.*;

class StreamDemo9 {
  public static void main(String args[])
  {
    ArrayList<String> myList = new ArrayList<String>();

    myList.add("alpha");
    myList.add("beta");
    myList.add("charlie");
    myList.add("delta");
    myList.add("echo");
    myList.add("foxtrot");

    //obtain stream from list
    Stream<String> myStream = myList.stream();

    //obtain spliterator
    Spliterator<String> mySplit = myStream.spliterator();

    //Iterate elements in the stream
    while(mySplit.tryAdvance( (n) -> System.out.println(n)));


  }
}
