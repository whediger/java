
import java.util.function.Function;

class UseFunctionInterfaceDemo {
  public static void main(String args[])
  {
    //block lambda => factorial
    Function<Integer, Integer> factorial = (n) -> {
      int result = 1;
      for(int i = 1; i <= n; i++) result = result * i;
      return result;
    };

    System.out.println("factorial of 3 is: " + factorial.apply(3));
    System.out.println("factorial of 3 is: " + factorial.apply(7));
  }
}
