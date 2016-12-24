
import java.util.*;
import java.util.stream.*;

class StreamDemo2 {
  public static void main(String[] args) {
    //creat list of integer values
    ArrayList<Integer> myList = new ArrayList<>();

    myList.add(7);
    myList.add(18);
    myList.add(10);
    myList.add(24);
    myList.add(17);
    myList.add(5);

    //two ways of obtaining the integer product using reduce
    Optional<Integer> productObj = myList.stream().reduce((a, b) -> a*b);
    if(productObj.isPresent())
        System.out.println("product as Opitional: " + productObj.get());

    int product = myList.stream().reduce(1, (a, b) -> a*b);
    System.out.println("Product as Int: " + product);
  }
}
