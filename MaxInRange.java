import java.util.Random;

//practice recursive array traversal

public class MaxInRange {

  /* Takes an arrey and a range of two values and returns max value in range of the two values
   * @param array and two ints representing a range to check
   * @return the max value found within the range
  **/
  public static int maxInRange(int[] arr, int start, int end){
    if ( start > end ){
      return -1;
    }
    return maxInRange(arr, start, end, 0);
  }

  private static int maxInRange(int[] arr, int start, int end, int maxVal){
    if ( maxVal < arr[start]){
      maxVal = arr[start];
    }
    if ( start == end ){
      return maxVal;
    }
    start++;
    return maxInRange(arr, start, end, maxVal);
  }

  public static void main(String[] args){

    int[] scores = new int[100];
    for ( int i = 0; i < 100; i++){
      Random rand = new Random();
      scores[i] = rand.nextInt(100);
    }
    int maxVal = maxInRange(scores, 60, 65);
    System.out.println("Max value is: " + maxVal);
  }
}
