
class GenCons {
  private double val;

  <T extends Number> GenCons(T arg) {
    val = arg.doubleValue();
  }

  void showval() {
    System.out.println("here is the val: " + val);
  }
}

class GenConsDemo {
  public static void main(String args[])
  {
    GenCons test = new GenCons(100);
    GenCons ftest = new GenCons(123.34f);

    test.showval();
    ftest.showval();
  }
}
