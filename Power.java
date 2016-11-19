

public class Power {

  public static double power(double x, int n){
    return power(x, n, x);
  }

  private static double power(double x, int n, double total){
    n--;
    if( n == 0 ){
      return total;
    }
    total = x * total;
    return power(x, n, total);
  }


  public static void main(String[] args){

    double result = power(5, 4);
    System.out.println(result);
  }
}
