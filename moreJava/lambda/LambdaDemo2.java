//use same functional interface with three different lambda expressions

//functional interface takes two int params and returns a boolean
interface NumericTest {
  boolean test(int n, int m);
}

class LambdaDemo2 {
  public static void main(String args[])
  {
    //this lambda determins if one num is factor of other
    NumericTest isFactor = (n, d) -> (n % d) == 0;

    if(isFactor.test(10, 2))
      System.out.println("2 is factor of 10");
    if(isFactor.test(10, 3))
      System.out.println("3 is not factor of 10");
    System.out.println();

    //lmabda returns true if first < second
    NumericTest lessThan = (n, m) -> (n < m);

    if(lessThan.test(2, 10))
      System.out.println("2 is lees than 10");
    if(lessThan.test(10, 2))
      System.out.println("10 is not less than 2");
    System.out.println();

    //this rturns true if abs val are equal
    NumericTest absEq = (n, m)  -> (n < m ? -n : n) == (m < n ? -m : m);

    if(absEq.test(4, -4))
      System.out.println("Absolute values of 4 and -4 are eq");
    if(absEq.test(4, -5))
      System.out.println("abs val of 4 and -5 are not eq");
  }
}
