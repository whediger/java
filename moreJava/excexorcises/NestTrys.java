
class NestTrys {
  public static void main(String args[]){
    //numer longer than denom
    int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
    int denom[] = { 2, 0, 4, 4, 0, 8 };

    try {//outer try
      for (int i = 0; i < numer.length; i++) {
        try{//nested try
          System.out.println(numer[i] + " / "
                              + denom[i]
                              + " is " + numer[i]/denom[i]);
        } catch (ArithmeticException exc) {
          System.out.println("cant divide by zero.");
        }
      }
    } catch (ArrayIndexOutOfBoundsException exc) {
      System.out.println("no matching element found");
      System.out.println("fatal error: Program terminatd.");
    }
  }
}
