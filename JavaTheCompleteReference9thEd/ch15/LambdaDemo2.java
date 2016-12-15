
//fuctional interface
interface NumericTest {
  boolean test(int n);
}


class LambdaDemo2 {
  public static void main(String args[])
  {
    //a lambda expression that tests if number is even
    NumericTest isEven = (n) -> (n % 2) == 0;

    if(isEven.test(10)) System.out.println("10 is even");
    if(!isEven.test(7)) System.out.println("7 is not even");

    //now use a lambds expression that tests if a number is non-negative

    NumericTest isNonNeg = (n) -> n >= 0;

    if(isNonNeg.test(1)) System.out.println("1 is not negative");
    if(!isNonNeg.test(-1)) System.out.println("-1 is negative");


  }
}
