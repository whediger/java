
class ExcDemo1 {
  public static void main(String args[]){
    int nums[] = new int[4];

    try {
      System.out.println("Before exception is exicuted");

      //create exception
      nums[0] = 10;
      System.out.println("after illegal argument");
    }
    catch (ArrayIndexOutOfBoundsException exc){
      System.out.println("Hey!!! that does not work, outOfBounds");
    }
    System.out.println("After the try catch block");
  }
}
