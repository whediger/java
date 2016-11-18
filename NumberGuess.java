import java.util.Scanner;
import java.util.Random;


public class NumberGuess {

  public static void main(String[] args){

    Random random = new Random();
    int randNum = random.nextInt(100) + 1;
    //System.out.println(randNum);
    int guess;
    int diff;
    Scanner in = new Scanner(System.in);

    System.out.println("I am thinking of a number between 1 and 100 (including both)");
    System.out.print("Can you guess what it is? ");
    guess = in.nextInt();
    System.out.println("");

    System.out.println("your guess was: " + guess + " my number is: " + randNum);
    System.out.println("The difference between the two is: " + (guess - randNum));


  }
}
