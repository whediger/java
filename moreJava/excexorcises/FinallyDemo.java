
class UseFinally {
  public static void genException(int what){
    int t;
    int nums[] = new int[2];

    System.out.println("Receving " + what);
    try {
      switch(what) {
        case 0:
          t = 10 / what; //divide by 0 error
          break;
        case 1:
          nums[4] = 4; //gennerate array index error
          break;
        case 2:
          return; //return from try block
      }
    } catch (ArithmeticException exc) {
      System.out.println("cant divide by zero");
    } catch (ArrayIndexOutOfBoundsException exc){
      System.out.println("no matching element");
    }
    finally {
      System.out.println("Leaving try from finally");
    }
  }
}

class FinallyDemo {
  public static void main(String args[]){
    for(int i = 0; i < 3; i++){
      UseFinally.genException(i);
      System.out.println();
    }
  }
}
