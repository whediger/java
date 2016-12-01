import java.lang.Math;

public class CheckFermat {

  public static boolean checkFermat(int a, int b, int c, int n){
    //check: there is no condiiton such that a^n + b^n = c^n except where n >= 2;
    //must be postive integers

    if ( Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && n > 2 ){
      System.out.println("Fermat was wrong!!!! HED2084  +==)========>");
      return true;
    } else if ( Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && n <= 2 ) {
      System.out.println("Yeah, big deal 'n' is less than 2. Fermat is still right.");
      return false;
    } else {
        System.out.println("howdy pardner");
        return false;
    }
  }

  public static void main(String[] args){
    int a, b, c, n;

    for ( int i = 0; i < 1000; i ++ ){
      a = (int) Math.random()*10000000;
      b = (int) Math.random()*10000000;
      c = (int) Math.random()*10000000;
      n = 1; //(int) Math.random()*2;

      if(checkFermat(a, b, c, n)){
        System.out.println("the magic numbers are: a = " + a + " b = " + b + " c = " + c + " n = " + n);
        break;
      };
    }
  }
}
