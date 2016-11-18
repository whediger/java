
public class Factorial {

  public static int calcFactorial(int n){
    if (n==0){
      return 1;
    }
    int recurse = calcFactorial(n - 1);
    int result = n * recurse;
    return result;
  }

  public static void main(String[] args){
    int num = calcFactorial(9);
    System.out.println(num);
  }
}
