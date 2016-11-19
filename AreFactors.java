

public class AreFactors {

  /* Tests if array only contains factors of a number
   * @param array of ints and int to check
   * @return true if ints in array are all factors of int.
  **/

  public static boolean areFactors(int[] arr, int num){

    for (int index : arr) {
      if (num % index != 0){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args){

    int[] threes = { 3, 6, 9, 12 };
    int threesNum = 108;

    int[] fours = { 4, 8 , 16, 32 };
    int foursNum = 64;

    int[] falseyArr = { 12, 43, 5, 87, 3};
    int falsyNum = 34;

    boolean factors = areFactors(threes, threesNum);
    System.out.println("Array is all factors of " + threesNum +": " + factors);

    factors = areFactors(fours, foursNum);
    System.out.println("Array is all factors of " + foursNum +": " + factors);

    factors = areFactors(falseyArr, falsyNum);
    System.out.println("Array is all factors of " + falsyNum +": " + factors);
  }
}
