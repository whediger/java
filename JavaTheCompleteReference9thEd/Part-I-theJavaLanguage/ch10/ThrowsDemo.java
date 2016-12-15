
class ThrowsDemo {
  static void throwOne() throws IllegalAccessException {
    System.out.println("Inside throws one");
    throw new IllegalAccessException("demo");
  }

  public static void main(String args[])
  {
    try {
      throwOne();
    } catch (IllegalAccessException exc){
      System.out.println("yay, caught it! - " + exc);
    }
  }
}
