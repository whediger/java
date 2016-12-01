import java.util.Scanner;
import java.util.Random;


public class NumberGuess {

  public static void checkNumber(int guess, int random){

    if( guess == random ){
      System.out.println("wow! you guessed it! the number is " + random +". :)  +==]========>");
    }
    if ( guess > random ){
      System.out.print("Sorry, " + guess + " is to high. Guess again ~ ");
      getGuess(random);
    }
    if ( guess < random ){
      System.out.print("Well... " + guess + " is to low Guess again ~ ");
      getGuess(random);
    }
  }

  public static void getGuess(int random) {
    int guess;
    Scanner in = new Scanner(System.in);
    guess = in.nextInt();

    checkNumber(guess, random);
  }

  public static void main(String[] args){

    Random random = new Random();
    int randNum = random.nextInt(100) + 1;
    int guess;
    int diff;
    Scanner in = new Scanner(System.in);

    System.out.println("I am thinking of a number between 1 and 100 (including both)");
    System.out.print("Can you guess what it is? ");
    guess = in.nextInt();
    checkNumber(guess, randNum);
  }
}
