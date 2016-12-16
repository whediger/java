
//use clone() method

class TestClone implements Cloneable {
  int a;
  double b;

  //this calls method clone
  TestClone cloneTest() {
    try {
      //call clone in object
      return (TestClone) super.clone();
    } catch(CloneNotSupportedException exc){
      System.out.println("cloning not allowed");
      return this;
    }
  }
}

class CloneDemo {
  public static void main(String[] args) {
    TestClone x1 = new TestClone();
    TestClone x2;

    x1.a = 10;
    x1.b = 20.98;

    x2 = x1 .cloneTest();

    System.out.println("x1: " + x1.a + " " + x1.b);
    System.out.println("x2: " + x2.a + " " + x2.b);
  }
}
