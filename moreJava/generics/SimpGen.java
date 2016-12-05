
//a simple generic class with 2 type parameters: T and V

class TwoGen<T, V> {
  T ob1;
  V ob2;

  //pass the constructor references to objects of type T and V
  TwoGen(T o1, V o2){
    ob1 = o1;
    ob2 = o2;
  }

  //show types of T and V
  void showTypes() {
    System.out.println("this is type of T: " + ob1.getClass().getName());
    System.out.println("this is type of V: " + ob2.getClass().getName());
  }

  T getob1(){
    return ob1;
  }

  V getob2(){
    return ob2;
  }
}

//Demonstrate TwoGen
class SimpGen {
  public static void main(String args[])
  {
    TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");

    // show the types
    tgObj.showTypes();

    // obtain and show values
    int v = tgObj.getob1();
    System.out.println("value: " + v);

    String str = tgObj.getob2();
    System.out.println("value " + str);
  }

}
