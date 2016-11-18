import java.util.Scanner;


public class ConvertSec {

  public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    int secIn;
    int hours;
    int min;
    int sec;

    System.out.print("Convert seconds to hours, min, sec: ");
    secIn = in.nextInt();

    hours = (secIn/60)/60;
    min = (secIn - (hours*60*60)) / 60;
    sec = (secIn - (hours*60*60)) % 60;

    System.out.println("hours " + hours + ", min " + min + " sec " + sec);
  }
}
