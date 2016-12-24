
import java.util.*;
import java.util.stream.*;

class StreamDemo4 {
  public static void main(String args[])
  {
    ArrayList<Double> myList = new ArrayList<Double>();

    myList.add(7.0);
    myList.add(18.0);
    myList.add(10.0);
    myList.add(24.0);
    myList.add(17.0);
    myList.add(5.0);

    //map the quareroot of the elements in mylist to stream
    Stream<Double> sqrtStream = myList.stream().map((n) -> Math.sqrt(n));

    double productOfSquareRoots = sqrtStream.reduce(1.0, (a,b) -> a*b);
    System.out.println("Product of sqrts: " + productOfSquareRoots);
  }
}
