import java.util.Random;


public class IndexOfMax {


  public static int indexOfMax(int[] arr){

    int maxIndex = 0;

    for (int i = 0; i < arr.length; i++){
      if (arr[maxIndex] < arr[i]){
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  public static void main(String[] args){

    int[] scores = new int[100];
    for ( int i = 0; i < 100; i++){
      Random rand = new Random();
      scores[i] = rand.nextInt(100);
    }
    int index = indexOfMax(scores);
    System.out.println("Max score was: " + scores[index]);
  }
}
