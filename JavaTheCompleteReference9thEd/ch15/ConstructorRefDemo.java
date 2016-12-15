
//demonstrate a constructor ref

interface MyFunc {
  MyClass func(int n);
}

class MyClass {
  private int val;

  MyClass(int v) { val = v; }

  MyClass() { val = 0; }


  int getVal() { return val; }
}

class ConstructorRefDemo {
  public static void main(String args[])
  {
    MyFunc myClassCons = MyClass::new;

    MyClass mc = myClassCons.func(1000);

    System.out.println("the value is: " + mc.getVal());
  }
}
