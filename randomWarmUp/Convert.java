import java.util.Scanner;

public class Convert {


  public static void main(String[] args){

    int inch;
    double cm;
    final double CM_PR_INCH = 2.54;
    Scanner in = new Scanner(System.in);

    System.out.println("How many inches? ");
    inch = in.nextInt();
    cm = inch*CM_PR_INCH;
    System.out.print(inch + " Inches = ");
    System.out.println(cm + " cm ");
    
  }
}
