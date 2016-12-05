
//an example of capturing  a local var from the enclosing scope

interface MyFunc {
  int func(int n);
}

class VarCapture {
  public static void main(String args[])
  {
    //a local var to capture --(((closure)))
    int num = 10;

    MyFunc myLambda = (n) -> {
      //this is okay, it does not change val of num
      int v = num + n;

      //illeagal because it attempts to change it
      // num++;

      return v;
    };

    //use lambda
    System.out.println(myLambda.func(8));
  }
}
