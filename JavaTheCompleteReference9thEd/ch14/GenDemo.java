
class Gen<T> {
  T ob;

  Gen(T o) {
    ob = o;
  }

  T getOb(){
    return ob;
  }

  void showType(){
    System.out.println("ob T is of type: " + ob.getClass().getName());
  }
}


class GenDemo {
  public static void main(String args[])
  {
    Gen<Integer> iOb;

    iOb = new Gen<Integer>(42);

    iOb.showType();

    int v = iOb.getOb();
    System.out.println("value of v  is " + v);

    System.out.println();

    //create a genobject for stings
    Gen<String> sOb = new Gen<String>("test string");

    sOb.showType();

    String str = sOb.getOb();
    System.out.println("String value: " + str);

  }
}
