
interface StringFunc {
  String func(String str);
}

class LambdaArgumentDemo {
  //method has functional interface as the type of first param.
  //Thus it can be passed as reference to any instance of that interface,
  //including instance created by a lambda expression. the second param is a string.
  static String changeStr(StringFunc sf, String s) {
    return sf.func(s);
  }

  public static void main(String args[])
  {
    String inStr = "Lambda Expression Expand Java";
    String outStr;

    System.out.println("input string: " + inStr);

    //define lambda to reverse string
    StringFunc reverse = (str) -> {
      String result = "";

      for (int i = str.length()-1; i>= 0; i--) {
        result += str.charAt(i);
      }

      return result;
    };

    outStr = changeStr(reverse, inStr);
    System.out.println("string reversed is " + outStr);

    //=> replaced spaces with hyphens
    //note: is is embedded directly in the call to changeString()
    outStr = changeStr((str) -> {
                        String result = "";
                        char ch;

                        for (int i = 0; i < str.length(); i++) {
                          ch = str.charAt(i);
                          if(Character.isUpperCase(ch))
                            result += Character.toLowerCase(ch);
                          else
                            result += Character.toUpperCase(ch);
                        }
                        return result;
                      }, inStr);
  System.out.println("the string in reversed caps: " + outStr);
  }
}
