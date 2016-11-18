import java.util.Scanner;


public class Temp {

  public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    float celsius;
    float fahrenheit;

    System.out.print("Enter a temperature in celsius: ");
    celsius = in.nextFloat();
    fahrenheit = ((celsius *9)/5 + 32);
    System.out.println("the temp in fahrenheit is: " + fahrenheit);
  }
}
