
//subclasses must precede superclasses in catch statements

class ExcDemo5 {
  public static void main(String args[]){
    //numer longer than denom
    int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
    int denom[] = { 2, 0, 4, 4, 0, 8 };

    for (int i = 0; i < numer.length; i++) {
      try {
        System.out.println(numer[i] + " / "
                            + denom[i]
                            + " is " + numer[i]/denom[i]);
      } catch (ArrayIndexOutOfBoundsException exc) {
        System.out.println("can't devide by zero");
      } catch (Throwable exc) {
        //Throwable is a catch superclass! So, subclass must go first.
        System.out.println("Some exception occurred.");
      }
    }
  }
}
