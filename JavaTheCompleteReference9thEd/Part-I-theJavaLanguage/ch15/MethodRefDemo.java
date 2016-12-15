
//demonstrate a method reference for a static method

//a functional interface for string operations
interface StringFunc {
  String func(String str);
}

//this class defines a static method
class MyStringOps {
  //a static method that reverses a string
  static String strReverse(String str){
    String result = "";

    for(int i = str.length()-1; i >= 0; i--) result += str.charAt(i);

    return result;
  }
}

class MethodRefDemo {
  //this method has a functional interface as the type of ist first param
  //thus, it can be passed any instance of that interface, including a method reference
  static String stringOp(StringFunc sf, String str) {
    return sf.func(str);
  }

  public static void main(String args[])
  {
    String inStr = "Lambdas add power to Java";
    String outStr;

    //Here a ref to string reverse is passed to stringOp()
    outStr = stringOp(MyStringOps::strReverse, inStr);

    System.out.println("Original string: " + inStr);
    System.out.println("String reversed: " + outStr);
  }
}
