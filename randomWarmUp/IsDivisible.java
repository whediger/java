//for playing with recursion

public class IsDivisible {


  public static boolean isDivisible(int numerator, int denominator){

      if( denominator == numerator ){
        return true;
      }
      if( denominator < numerator ){
        return false;
      }

      return isDivisible((numerator - denominator), denominator);
  }

  public static void main(String[] args){

    boolean result = isDivisible(41, 7);
    System.out.println(result);
  }
}
