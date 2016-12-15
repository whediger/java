
interface StringFunc {
  String func(String n);
}

class LambdaAsArgumentsDemo {
  static String stringOp(StringFunc sf, String str){
    return sf.func(str);
  }

  public static void main(String args[])
  {
    String inStr = "Lambdas add power to Java";
    String outStr;

    System.out.println("Here is the input string: " + inStr);

    outStr = stringOp((str) -> str.toUpperCase(), inStr);

    System.out.println("input string in uppercase " + outStr);

    outStr = stringOp((str) -> {
      String result = "";
      int i;

      for(i = 0; i < str.length(); i++)
        if(str.charAt(i) != ' ') result += str.charAt(i);

      return result;
    }, inStr);

    System.out.println("the string with spaces removed: " + outStr);

    StringFunc reverse = (str) -> {
      String result = "";
      int i;

      for(i = str.length()-1; i >= 0; i--)
        result += str.charAt(i);

      return result;
    };

    System.out.println("String reversed: " + stringOp(reverse, inStr));
  }
}
