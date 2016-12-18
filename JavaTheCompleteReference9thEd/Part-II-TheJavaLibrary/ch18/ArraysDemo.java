
import java.util.*;

class ArraysDemo {
  public static void main(String args[])
  {
    //Allocate and initialze array
    int arr[] = new int[10];
    for (int i = 0; i < 10; i++) {
      arr[i] = -3 * i;
    }

    System.out.println("Original contents: ");
    display(arr);
    Arrays.sort(arr);
    System.out.println("Sorted: ");
    display(arr);

    //fill and display the array
    Arrays.fill(arr, 2, 6, -1);
    System.out.println("After fill: ");
    display(arr);

    //sort and display array
    Arrays.sort(arr);
    System.out.println("After sorting again: ");
    display(arr);

    //binary search for -9
    System.out.println("the number -9 is at index: ");
    int index = Arrays.binarySearch(arr, -9);
    System.out.println(index);
  }

  static void display(int ar[]){
    for(int i : ar)
      System.out.print(i + " ");

    System.out.println();  
  }
}
