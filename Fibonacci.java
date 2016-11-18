

public class Fibonacci {

  public static long fibonacci(int n){
    if ( n == 1 || n == 2){
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args){

    long result = fibonacci(42);
    System.out.println(result);

  }
}
