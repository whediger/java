
interface NumericTest2 {
  boolean test(int x, int y);
}

class LambdaDemo3 {
  public static void main(String args[])
  {
    //this lambda determins if one number is a factor of another
    NumericTest2 isFactor = (x, y) -> (x % y) == 0;

    if(isFactor.test(10, 2)) System.out.println("2 is a factor of 10");

    if(!isFactor.test(10,3)) System.out.println("3 is not a factor of 10");

    
  }
}
