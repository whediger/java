//a generic interface demo

//this interface implies that an implementing class
//contains one or more values
interface Containment<T> {
  //the contains() method tests if a specific item is contained
  //within an object that impliments one or more values
  boolean contains(T o);
}

//impliment containment using an array to hold the values
class MyClass<T> implements Containment<T> {
  T[] arrayRef;

  MyClass(T[] o) {
    arrayRef = o;
  }

  //Impliment contains()
  public boolean contains(T o) {
    for(T x : arrayRef)
      if(x.equals(o)) return true;
    return false;
  }
}

class GenIFDemo {
  public static void main(String args[])
  {
    Integer x[] = { 1,2,3 };

    MyClass<Integer> ob = new MyClass<Integer>(x);

    if(ob.contains(2))
      System.out.println("2 is in obj");
    else
      System.out.println("2 is NOT in obj");

    if(ob.contains(5))
      System.out.println("5 is in obj");
    else
      System.out.println("5 is NOT in obj");

    //the following is illeagal and will not compile
    // if((ob.contains(9.25)))
    //   System.out.println("9.25 is in obj");
  }
}
