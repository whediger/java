
//creates a custome exception

class MyException extends Exception {
  private int detail;

  MyException(int a) {
    detail = a;
  }

  public String toString(){
    return "MyException[" + detail + "]";
  }
}

class ExceptionDemo {
  static void compute(int a) throws MyException {
    System.out.println("called compute(" + a + ")");
    if(a > 10) throw new MyException(a);
    System.out.println("normal exit");
  }

  public static void main(String args[])
  {
    try {
      compute(1);
      compute(20);
    } catch (MyException exc) {
      System.out.println("caught MyException - " + exc);
    }
  }
}
