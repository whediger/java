//more practice in recursion


public class OddSum {

  /* Takes a positive odd numbered integer
  *  @param an odd integer
  *  @return the number of odd numbers less than the number provided
  **/

    public static int oddSum(int oddNum){
      return addSum(oddNum, 0);
    }

    public static int addSum(int oddNum, int oddTotal){

      if (oddNum >= 1 ){
        if ( oddNum % 2 != 0 ){
          oddTotal += oddNum;
          System.out.println(oddTotal);
        }
      } else {
        return oddTotal;
      }
      return addSum((oddNum - 1), oddTotal);
    }

    public static void main(String[] args){

      int oddNum = 35;
      System.out.println(oddSum(oddNum));
    }
}
