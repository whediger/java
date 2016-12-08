
//varargs refresher

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
