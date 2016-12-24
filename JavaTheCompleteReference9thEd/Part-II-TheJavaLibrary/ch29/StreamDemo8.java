
import java.util.*;
import java.util.stream.*;

class StreamDemo8 {
  public static void main(String args[])
  {
    ArrayList<String> myList = new ArrayList<String>();

    myList.add("dsf");
    myList.add("tg");
    myList.add("ht");
    myList.add("nr");
    myList.add("rt");
    myList.add("ry");

    Stream<String> myStream = myList.stream();

    //obain an iterator
    Iterator<String> itr = myStream.iterator();

    while(itr.hasNext()) System.out.println(itr.next());
  }
}
