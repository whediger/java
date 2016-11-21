
public class BigJava {

  public static int factorial(int num){
    if (num == 0) { return 1; };

    int recurse = factorial(num - 1);
    int result = num * recurse;
    return result;
  }


  public static int[] factorialArray(int num){
    int[] result = new int[num];
    return factorialArray(num, result);
  }

  private static int[] factorialArray(int num, int[] result){

    if (num == 0){
      result[0] = 1;
      return result; }

    result[num - 1] = factorial(num);
    num--;
    return factorialArray(num, result);
  }

  public static void main(String[] args){

    int num = Integer.parseInt(args[0]);
    int result = factorial(num);
    System.out.println(result);

    int[] arrayResult = factorialArray(num);
    for (int i = 0; i < arrayResult.length; i++){
      System.out.println(arrayResult[i]);
    }

  }
}
