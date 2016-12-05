
//demonstrate method ref for static method

//functional interface for numeric predicates that operate on int values
interface IntPredicate {
  boolean test(int n);
}

//three static methods to check int
class MyIntPredicates {
  //=> true if prime
  static boolean isPrime(int n) {
    if(n < 2) return false;
    for (int i = 2; i <= n / i; i++) {
      if((n % i) == 0)
        return false;
    }
    return true;
  }

  //static method => true is a number is even
  static boolean isEven(int n) {
    return (n % 2) == 0;
  }

  //static method => true if num > 0
  static boolean isPositive(int n) {
    return n > 0;
  }
}

class MethodRefDemo {
  //has func interface as first param. so, ir can be passed a ref to any instance
  //of that interface, including one created by a method ref
  static boolean numTest(IntPredicate p, int v) {
    return p.test(v);
  }

  public static void main(String args[])
  {
    boolean result;

    //ref to isPrime is passed to numTest();
    result = numTest(MyIntPredicates::isPrime, 17);
    if(result) System.out.println("17 is prime");

    //ref to isEven is used
    result = numTest(MyIntPredicates::isEven, 12);
    if(result) System.out.println("12 is even");

    //ref to isPostitive
    result = numTest(MyIntPredicates::isPositive, 11);
    if(result) System.out.println("11 is positive");
  }
}
