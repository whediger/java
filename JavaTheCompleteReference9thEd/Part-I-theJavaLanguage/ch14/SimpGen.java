
class TwoGen<T, V> {
  T ob1;
  V ob2;

  TwoGen(T o1, V o2) {
    ob1 = o1;
    ob2 = o2;
  }

  void showTypes() {
    System.out.println("Type of ob1 is " + ob1.getClass().getName());
    System.out.println("Type of ob2 is " + ob2.getClass().getName());
  }

  T getob1() {
    return ob1;
  }

  V getob2() {
    return ob2;
  }
}


class SimpGen {
  public static void main(String args[])
  {
    TwoGen<Integer, String> twoOb = new TwoGen<Integer, String>(88, "Genericalishious");

      twoOb.showTypes();

      int v = twoOb.getob1();
      System.out.println("ob 1 returned: " + v);

      String str = twoOb.getob2();
      System.out.println("ob 2 returned " + str);
  }
}
