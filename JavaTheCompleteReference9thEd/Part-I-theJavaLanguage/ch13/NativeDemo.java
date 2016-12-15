
public class NativeDemo {
  int i;
  public static void main(String args[])
  {
    NativeDemo ob = new NativeDemo();

    ob.i = 10;
    System.out.println("This is ob.i before native: " + ob.i);

    ob.test();
    System.out.println("This is ob.i after native: " + ob.i);
  }

  public native void test();

  //load dll that contains static method

  static {
    System.loadLibrary("NativeDemo");
  }
}
