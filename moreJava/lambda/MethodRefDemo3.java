
//use instance method ref to refer to any instance

interface MyIntNumPredicate {
  boolean test(MyIntNum mv, int n);
}

//stores an int val and defines the instance method isFactor()
//=>true is its argument is a factorof the stored value
class MyIntNum {
  private int v;

  MyIntNum(int x) { v = x; }

  int getNum() { return v; }

  boolean isFactor(int n) {
    return (v % n) == 0;
  }
}

class MethodRefDemo3 {
  public static void main(String args[])
  {
    boolean result;

    MyIntNum myNum = new MyIntNum(12);
    MyIntNum myNum2 = new MyIntNum(16);

    //makes inp ref to the instance method isFactor()
    MyIntNumPredicate inp = MyIntNum::isFactor;

    //calls isFactor() on myNum
    result = inp.test(myNum, 3);
    if(result) System.out.println("3 is a factor of " + myNum.getNum());

    //calls isFactor() on myNum2
    result = inp.test(myNum2, 3);
    if(!result) System.out.println("3 is NOT a factor of " + myNum2.getNum());
  }
}
