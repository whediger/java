//a simple generic class
//T is a type paramerter that will be replaced by a real type
//when an object of Gen is created

class Gen<T> {
  T ob; //declare an object of type T

  //pass the constructor a refrence to an object to T
  Gen(T o) {
    ob = o;
  }

  //return o
  T getob() {
    return ob;
  }

  //show type of T
  void showType(){
    System.out.println("Type of T is " + ob.getClass().getName());
  }
}

//demonstrate the generic class
class GenDemo {
  public static void main(String args[])
  {
    // create a generic reference for integers
    Gen<Integer> iOb;

    //create a Gen<Integer> object and assign its reference to iOb.
    //Notice the use of autoboxing to encapsulate the vlue 88 within and Integer object.
    iOb = new Gen<Integer>(88);

    //show the type of data used by iOb
    iOb.showType();

    //get the value in iOb. Notice that no cast is needed
    int v = iOb.getob();
    System.out.println("Value: " + v);

    System.out.println();

    //create a Gen object for Strings
    Gen<String> strOb = new Gen<String>("Generics Test");

    //show the type of data used by strOb.
    strOb.showType();

    //get the value of strObj. Again, notice that no cast is needed
    String str = strOb.getob();
    System.out.println("Value: " + str);

  }
}
