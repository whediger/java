
//a block lambda finds smallest positive factor of an int val

interface NumericFunc{
  int func(int n);
}

class BlockLambdaDemo {
  public static void main(String args[])
  {
    //=> smallest pos factor of a value
    NumericFunc smallestF = (n) -> {
      int result = 1;
      //get abs value of n
      n = n < 0 ? -n : n;

      for (int i = 2; i <= n; i++) {
        if((n % i) == 0) {
          result = i;
          break;
        }
      }
      return result;
    };
    System.out.println("smallest factor of 12 is " + smallestF.func(12));
    System.out.println("Smallest factor of 11 is " + smallestF.func(11));
    System.out.println("smallest fact of 157 is " + smallestF.func(157));
  }
}
