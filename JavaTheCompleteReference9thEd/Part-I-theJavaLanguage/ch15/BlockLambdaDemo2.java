
interface StringFunc {
  String func(String n);
}

class BlockLambdaDemo2 {
  public static void main(String args[])
  {

    //this is a reverse string lambda
    StringFunc reverse = (str) -> {
      String result = "";
      int i;

      for(i = str.length()-1; i >= 0; i--) result += str.charAt(i);

      return result;
    };

    System.out.println("hellothere in reverse is: " + reverse.func("hellothere"));
    System.out.println("somesld;fjoe in reverse is: " + reverse.func("somesld;fjoe"));
  }
}
