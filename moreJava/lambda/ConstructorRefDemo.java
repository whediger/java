
//demonstrate constructor ref

interface MyFunc {
  MyClass func(String s);
}

class MyClass {
  private String str;

  MyClass(String s) { str = s; }

  MyClass() { str = ""; }

  String getStr() { return str;}

}

class ConstructorRefDemo {
  public static void main(String args[])
  {
    //new refers to parameterized constructor NOT default!
    MyFunc myClassCons = MyClass::new;

    //create an instance of MyClass via that construc ref
    //ref created ^^^
    MyClass mc = myClassCons.func("Testing");

    System.out.println("str in mc is " + mc.getStr());
  }
}
