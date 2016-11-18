import java.lang.Math;

public class CheckFermat {

  public static void checkFermat(int a, int b, int c, int n){
    //check: there is no condiiton such that a^n + b^n = c^n except where n >= 2;

    if ( Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && n > 2 ){
      System.out.println("Fermat was wrong!!!!   +==)========>");
    } else if ( Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && n <= 2 ) {
      System.out.println("Yeah, big deal 'n' is less than 2. Fermat is still right.");
    } else {
        System.out.println("howdy pardner");
    }
  }

  public static void main(String[] args){
    checkFermat(1, 2, 3, 4);
  }
}
