
//using a generic interface

//gen func interface w- 2 params
interface SomeTest<T> {
  boolean test(T n, T m);
}

class GenericFunctionalInterfaceDemo {
  public static void main(String args[])
  {
    //determins if int is factor of other int
    SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

    if(isFactor.test(10, 2))
      System.out.println("2 is factor of 10");
    System.out.println();

    // => one double factor of another
    SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

    if(isFactorD.test(212.0, 4.0))
      System.out.println("4.0 is factor of 212.0");
    System.out.println();

    //=> if string is substring of another
    SomeTest<String> strTest = (a, b) -> a.indexOf(b) != -1;

    String str = "Generic Functional Interface";

    System.out.println("testing string " + str);

    if(strTest.test(str, "face"))
      System.out.println("'face' is a substring");
    else
      System.out.println("'face' is NOT a substring");
  }
}
