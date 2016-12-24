
import java.util.*;
import java.util.stream.*;


class StreamDemo {
  public static void main(String args[])
  {
    ArrayList<Integer> myList = new ArrayList<>();

    myList.add(7);
    myList.add(18);
    myList.add(10);
    myList.add(24);
    myList.add(17);
    myList.add(5);

    System.out.println("Original list: " + myList);

    //obtaina stream to the ArrayList
    Stream<Integer> myStream = myList.stream();
    //obtain min and max val bu using min(), max(), isPresent(), and get().
    Optional<Integer> minVal = myStream.min(Integer::compare);
    if(minVal.isPresent()) System.out.println("Max value is: " + minVal.get());

    //need to get new stream because previous call to min()
    //is terminal operation that consumed the stream
    myStream = myList.stream();
    Optional<Integer> maxVal = myStream.max(Integer::compare);
    if(maxVal.isPresent())System.out.println("Maximum value is: " + maxVal.get());

    //sort the stream by using sorted
    Stream<Integer> sortedStream = myList.stream().sorted();

    //display the sorted stream by use of foreach()
    System.out.print("Sorted stream: ");
    sortedStream.forEach((n) -> System.out.print(n + " : "));
    System.out.println();

    //display only the odd values by use of a filter
    Stream<Integer> oddVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
    System.out.print("Odd values: ");
    oddVals.forEach((n) -> System.out.print(n + " : "));
    System.out.println();

    //display odd value that are over 5
    //use two filters that are piplined
    oddVals = myList.stream().filter((n) -> (n % 2) == 1)
                                      .filter((n) -> n > 5);
    System.out.println("Odd values greater than 5: ");
    oddVals.forEach((n) -> System.out.print(n + " : "));
    System.out.println();
  }
}
