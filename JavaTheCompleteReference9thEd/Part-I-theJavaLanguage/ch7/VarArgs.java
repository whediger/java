
//varargs refresher

//Note: vararg params CAN BE EMPTY. so an empty param call is valid for a vararg
//as a result, it can be ambiguous. If more than one signiture contains varargs and a call
//is made with no params the compiler has no way to segrigate whic signiture is correct!!! 

class VarArgs {
  static void VaTest(int ... v){
    System.out.println("there are " + v.length + " arguments");
    System.out.println(v[2] + " is the third argument");
  }

  public static void main(String args[])
  {
    VarArgs stuff = new VarArgs();

    stuff.VaTest(1,2,3,4,5,6,7);

  }
}
