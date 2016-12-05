
//autoboxing takes place with method prameters and return values.

class AutoBox2 {
  //this method has an Integer parameter
  static void m(Integer v){
    System.out.println("m() recieved " + v);
  }

  //this method returns an int
  static int m2() {
    return 10;
  }

  //this method returns an Integer
  static Integer m3(){
    return 99;
  }

  public static void main(String args[])
  {
    //pass an int to m(). Because m() has an Integer parameter
    //the int value passed is automatically boxed
    m(199);

    //here iOb recieves the int value returned my m2()
    //this value is automatically boxed so that it can be assigned to iOb
    Integer iOb = m2();
    System.out.println("Return value from m2() is " + iOb);

    //Next, m3() is called. It returns an integer value
    //which is autounboxed into an int.
    int i = m3();
    System.out.println("Returned value by m3() is " + i);

    //next, Math.sqrt() is called with iOb as an argument
    //In this case, iOb is auto-unboxed and its value is promoted to double
    //which is the type needed by Math.sqrt();
    iOb = 100;
    System.out.println("The sqrt of iOb = 100 is " + Math.sqrt(iOb));
  }
}
