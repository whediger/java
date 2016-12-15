
//demonstrate a method reference to a generic method
//declaired inside a generic class

interface MyFunc<T> {
  int func(T[] vals, T v);
}

class MyArrayOps {
  static <T> int countMatching(T[] vals, T v) {
    int count = 0;

    for(int i = 0; i < vals.length; i++) if(vals[i] == v) count++;

    return count;
  }
}

class GenericMethodRefDemo {
  //this method has the generic MyFunc<T>() functional interface
  //ass its first parameter. the other two params are an Array and a value both of type <T>
  static <T> int myOp(MyFunc<T> f, T[] vals, T v){
    return f.func(vals, v);
  }

  public static void main(String args[])
  {
    Integer[] vals = {1,5,5,5,5,6,7};
    String str[] = {"one", "two", "three", "three", "five", "three" };
    int count;

    count = myOp(MyArrayOps::<Integer>countMatching, vals, 5);
    System.out.println("There are this many 5's: " + count);

    count = myOp(MyArrayOps::<String>countMatching, str, "three");
    System.out.println("there are this many 'threes': " + count);

  }
}
