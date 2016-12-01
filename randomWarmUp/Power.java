

public class Power {

  public static double power(double x, int n){
    return power(x, n, x);
  }

  private static double power(double x, int n, double total){
    if( n == 1 ){
      return total;
    }
    return power(x, (n - 1), (x * total));
  }

  public static double iterativePower(double x, int n){
    double num = x;
    for (int i = n -1; i > 0; i--){
      x *= num;
    }
    return x;
  }


  public static void main(String[] args){

    double result = power(5, 4);
    System.out.println(result);

    double iterate = iterativePower(5, 4);
    System.out.println(iterate);
  }
}
