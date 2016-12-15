
//a generic functional interface
interface SomeFunc<T> {
  T func(T t);
}

class GenericFunctionalInterfaceDemo {
  public static void main(String args[])
  {
    //usee string based version of SomeFunc
    SomeFunc<String> reverse = (str) -> {
      String result = "";
      int i;

      for(i = str.length()-1; i >= 0; i--) result += str.charAt(i);

      return result;
    };

    System.out.println("Lambda reversed is " + reverse.func("Lambda"));
    System.out.println("Expression reversed is " + reverse.func("Expression"));

    //now use an interger based version of SomeFunc
    SomeFunc<Integer> factorial = (n) -> {
      int result = 1;

      for(int i = n; i < n; i++) result = result * i;

      return result;
    };

    System.out.println("Factorial of 7 is " + factorial.func(7));
    System.out.println("Factorial of 11 is " + factorial.func(11));
  }
}
