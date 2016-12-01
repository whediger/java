
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

  public static double myExp(int x, int n){
    double result = 0;
    for (int i = 0; i < n; i++){
      System.out.println("x: " + x + " n " + n + " i " + i);
      System.out.println(result);
      if ( i == 0 ){
        result += 1;
        continue;
      }
      if ( i == 1){
        result += i;
        continue;
      }
      result += (Math.pow(x, i)/calcFactorial(i));
    }
    return result;
  }

  public static void main(String[] args){
    int num = calcFactorial(9);
    System.out.println(num);

    int iterate = iterateFactorial(9);
    System.out.println(iterate);

    double exp = myExp(2, 34);
    System.out.println(exp);
  }
}
