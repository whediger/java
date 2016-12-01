import java.math.BigInteger;


public class BigJava {

  public static String factorial(int num){

    BigInteger fact = new BigInteger("1");
    for (int i = 1; i <= num; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact.toString();
    // if (num == 0) { return BigInteger.valueOf(1); };
    //
    // int recurse = factorial(num - 1);
    // BigInteger result = BigInteger.valueOf(recurse);
    // result = result.valueOf(num * recurse);
    //
    // return result;
  }


  // public static int[] factorialArray(int num){
  //   int[] result = new int[num];
  //   return factorialArray(num, result);
  // }
  //
  // private static int[] factorialArray(int num, int[] result){
  //
  //   if (num == 0){
  //     result[0] = 1;
  //     return result; }
  //
  //   result[num - 1] = factorial(num);
  //   num--;
  //   return factorialArray(num, result);
  // }

  public static void main(String[] args){

    int num = Integer.parseInt(args[0]);
    String result = factorial(num);
    System.out.println(result);

    // int[] arrayResult = factorialArray(num);
    // for (int i = 0; i < arrayResult.length; i++){
    //   System.out.println(arrayResult[i]);
    // }

  }
}
