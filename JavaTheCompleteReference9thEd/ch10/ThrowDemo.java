//throw demo

class ThrowDemo {

  static void demoproc(){
    try {
      throw new NullPointerException("demo");
    } catch(NullPointerException exc) {
      System.out.println("caught inside demoproc");
      throw exc; //re-throw exc
    }
  }
  public static void main(String args[])
  {
    try {
      demoproc();
    } catch (NullPointerException exc) {
      System.out.println("Recaught: " + exc);
    }
  }
}
