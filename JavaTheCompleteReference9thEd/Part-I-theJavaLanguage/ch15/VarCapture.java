
//example of capturing a var from enclosing scope
//when captured is becomes <<effectively final>> and cannot be changed

interface MyFunc {
  int func(int n);
}

class VarCature {
  public static void main(String args[])
  {
    //local var that can be captured
    int num = 10;

    MyFunc myLambda = (n) -> {
      //this use of num is alright, it does not change it
      int v = num + n;

      //the follwoing is illegal because it changes num!!!!
      // num++;

      return v;
    };
    //this is also illegal because it changes the <<effectively final>> status of num`
    // num = 7;
  }
}
