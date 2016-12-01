import java.lang.Math;

public class PowArray {

  public static double[] powArray(double[] a, int n){

    for (double i : a) {
      i = Math.pow(i, n);
      System.out.print(i + ", ");
    }
    return a;
  }

  public static void main(String[] args){

    double[] a = { 2, 3, 4, 6, 1, 3, 7, 6 };
    a = powArray(a, 2);
  }
}
