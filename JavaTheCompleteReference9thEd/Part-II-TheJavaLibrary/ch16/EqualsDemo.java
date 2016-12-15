
class EqualsDemo {
  public static void main(String args[])
  {
    String s1 = "Hello";
    String s2 = "Goodbye";
    String s3 = "Hello";
    String s4 = "HELLO";

    System.out.println("s1 equals s2 " + s1.equals(s2));
    System.out.println("s1 equals s3 " + s1.equals(s3));
    System.out.println("s1 equals s4 " + s1.equals(s4));
    System.out.println("s1 equals s4 ignoreCase " + s1.equalsIgnor1eCase(s4));
  }
}
