
import java.util.*;
import java.util.stream.*;

class StreamDemo6 {
  public static void main(String[] args) {

    ArrayList<Double> myList = new ArrayList<Double>();

    myList.add(1.0);
    myList.add(3.6);
    myList.add(9.2);
    myList.add(4.7);
    myList.add(12.1);
    myList.add(5.0);

    System.out.print("Original values in my list: ");
    myList.stream().forEach( (n) -> System.out.print(n + " : "));
    System.out.println();

    //map the ceiling of elements in mylit to an intstream
    IntStream cStrm = myList.stream().mapToInt( (a) -> (int)Math.ceil(a));

    System.out.print("The ceiling of values in myList: ");
    cStrm.forEach( (a) -> System.out.print(a + " : "));
    System.out.println();

    System.out.println("reprinting myList: ");
    myList.stream().forEach( (n) -> System.out.print(n + " : "));
    System.out.println();
  }
}
