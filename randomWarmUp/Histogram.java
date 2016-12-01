import java.util.Random;

public class Histogram {

  public static int[] histogram(int[] scores, int countLength){
    int[] counts = new int[countLength];
    for (int score : scores){
      counts[score]++;
    }
    return counts;
  }

  public static void main(String[] args){

    int[] scores = new int[100];
    for ( int i = 0; i < 100; i++){
      Random rand = new Random();
      scores[i] = rand.nextInt(100);
      // System.out.println("+==]========>");
      // System.out.println(scores[i]);
    }

    int[] histo = histogram(scores, scores.length );

    for ( int i = 0; i < 100; i++){
      if(i % 10 == 0) {System.out.println("");};
      System.out.print(histo[i]);

    }
  }
}
