

interface StringTest{
  boolean test(String a, String b);
}

class LambdaDemo3 {
  public static void main(String args[])
  {
    //this lambda determins if one string is part of another
    StringTest isIn = (a, b) -> a.indexOf(b) != -1;

    String str = "This is a test";

    System.out.println("Testing string " + str);

    if(isIn.test(str, "is a"))
      System.out.println("'is a' is in string");
    else
      System.out.println("'is a' is NOT in string");

    if(!isIn.test(str, "xyz"))
      System.out.println("'xyz is not in string'");
  }
}
