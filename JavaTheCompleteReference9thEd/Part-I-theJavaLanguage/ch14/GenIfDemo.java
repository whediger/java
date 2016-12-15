
//generic interface demo

//a min / max interface

interface MinMax<T extends Comparable<T>> {
  T min();
  T max();
}

//impliment MinMax
class MyClass<T extends Comparable<T>> implements MinMax<T> {
  T[] vals;

  MyClass(T[] o) { vals =  o; }

  public T min() {
    T v = vals[0];

    for (int i = 0; i < vals.length; i++)
      if(vals[i].compareTo(v) < 0) v = vals[i];

    return v;
  }

  public T max() {
    T v = vals[0];

    for (int i = 0; i < vals.length; i++)
      if(vals[i].compareTo(v) > 0) v = vals[i];

    return v;
  }
}

class GenIfDemo {
  public static void main(String args[])
  {
    Integer inums[] = {1,2,3,4,5,6,7};
    Character chrs[] = { 'b','r','p','w'};

    MyClass<Integer> iob = new MyClass<Integer>(inums);
    MyClass<Character> cob = new MyClass<Character>(chrs);

    System.out.println("max value in Inums is " + iob.max());
    System.out.println("min val in inums is " + iob.min());

    System.out.println("max char is: " + cob.max());
    System.out.println("min char is: " + cob.min());
  }
}
