
//demonstrate a method ref to an instance method

//a functional interface for string operations
interface StringFunc {
  String func(String n);
}

class MyStringOps {
  String strReverse(String str){
    String result = "";

    for(int i = str.length()-1; i >= 0; i--)
      result += str.charAt(i);

    return result;
  }
}

class MethodRefDemo2 {
  //this method has a functional interface as its first param
  static String stringOp(StringFunc sf, String str){
    return sf.func(str);
  }

  public static void main(String args[])
  {
    String inStr = "Lambdas are great";
    String outStr;

    //create a mystring ob
    MyStringOps strOps = new MyStringOps();

    //now a method ref to the instance method strReverse
    //is passed to stringOps()
    outStr = stringOp(strOps::strReverse, inStr);

    System.out.println("Original string: " + inStr);
    System.out.println("String Reversed: " + outStr);
  }
}
