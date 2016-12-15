
//impliment a simple class factory using a constructor reference

interface MyFunc<R, T> {
  R func(T n);
}

//a simple generic class
class MyClass<T>{
  private T val;

  MyClass(T t){ val = t; }

  MyClass(){ val = null; }

  T getVal(){ return val; }
}

class MyClass2 {
  String str;

  MyClass2(String s) { str = s; }

  MyClass2() { str = null; }

  String getStr() { return str; }
}

class ConstructorRefDemo3 {

  static <R,T> R myClassFactory(MyFunc<R, T> cons, T v){
    return cons.func(v);
  }

  public static void main(String args[])
  {
    MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;

    MyClass<Double> mc = myClassFactory(myClassCons, 100.1);

    System.out.println("val in mc is: " + mc.getVal());

    //now create a different class by use of myClassfactory()
    MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

    //create an instance of MyClass2  by use of the factory method
    MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda");

    System.out.println("vlaue of mc2 is " + mc2.getStr());
  }
}
