
class MultiCatch {
  public static void main(String args[]){
    int a=88, b=0;
    int result;
    char chars[] = {'A', 'B', 'C'};

    for (int i = 0; i < 2; i++) {
      try {
        if (i == 0)
          result = a / b; //ArithmeticException
        else
          chars[5] = 'X'; //arry out of bounds
      } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
        System.out.print("Exception caught: " + e);
      }
    }
    System.out.println("After muticatch");
  }
}
