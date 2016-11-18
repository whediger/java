import java.lang.Math;


public class Multadd {

    /* Takes three doubles a, b, and c
    *  @param three doubles
    *  @return the first value multiplied by the second value added to the third value
    **/

    public static double multadd(double a, double b, double c){
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      return (a * b + c);
    }

    public static void main(String[] args){
      double result = multadd(1.0,3.0,4.0);
      System.out.println(result);

      //find the value of [sin(π/4) + (cos(π/4)/2)] by using multiadd method
      double trigResult = multadd(Math.cos(Math.PI/4), (0.5), Math.sin(Math.PI/4));
      System.out.println(trigResult);

      double cos = Math.cos(Math.PI/4)/2 + Math.sin(Math.PI/4);
      System.out.println(cos);

    }
}
