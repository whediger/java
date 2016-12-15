
//Use a method ref to to help find the maximum value in a collection

import java.util.*;

class MyClass {
  private int val;

  MyClass(int v) { val = v; }

  int getVal() { return val; }
}

class UseMethodRef {

  static int compareMC(MyClass a, MyClass b) {
    return a.getVal() - b.getVal();
  }

  public static void main(String args[])
  {
    ArrayList<MyClass> al = new ArrayList<MyClass>();

    al.add(new MyClass(1));
    al.add(new MyClass(2));
    al.add(new MyClass(3));
    al.add(new MyClass(57));
    al.add(new MyClass(7));
    al.add(new MyClass(11));
    al.add(new MyClass(13));

    //find max value using comparitor
    MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC);

    System.out.println("max val is: " + maxValObj.getVal());
  }
}
