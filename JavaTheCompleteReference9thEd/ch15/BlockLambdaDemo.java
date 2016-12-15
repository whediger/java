
interface NumericFunc {
  int func(int n);
}

class BlockLambdaDemo {
  public static void main(String args[])
  {
    //this block lambda computes the factorial of a number
    NumericFunc factorial = (n) -> {
      int result = 1;

      for (int i = 0; i <= n; i++) result = i * result;

      return result;
    };

    System.out.println("factorial of 3 is " + factorial.func(3));
    System.out.println("factorial of 8 is " + factorial.func(8));
  }
}
