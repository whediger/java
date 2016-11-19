
public class Factorial {

  public static int calcFactorial(int n){
    if (n==0){
      return 1;
    }
    int recurse = calcFactorial(n - 1);
    int result = n * recurse;
    return result;
  }

  public static int iterateFactorial(int num){
    int result;
    for (int i = num -1; i > 1; i--){
      num *= i;
    }
    return num;
  }

  public static void main(String[] args){
    int num = calcFactorial(9);
    System.out.println(num);

    int iterate = iterateFactorial(9);
    System.out.println(iterate);
  }
}
