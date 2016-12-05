
//the type argument for T must be a number or a class derived from number
class NumericFns<T extends Number> {
  T num;

  //pass the constructor a reference to a numeric object
  NumericFns(T n) {
    num = n;
  }

  //Return the reciprocal
  double reciprocal() {
    return 1 / num.doubleValue();
  }

  //return the fracitonal component
  double fraction() {
    return num.doubleValue() - num.intValue();
  }
}

//demonstrate NumericFns
class BoundsDemo {
  public static void main(String args[])
  {
    NumericFns<Integer> iOb = new NumericFns<Integer>(5);

    System.out.println("recipocal of iOb is " + iOb.reciprocal());
    System.out.println("fractional component of iOb is " + iOb.fraction());

    System.out.println();

    NumericFns<Double> dOb = new NumericFns<Double>(5.25);

    System.out.println("reciprocal of dOb is " + dOb.reciprocal());
    System.out.println("fractional component of dOb is " + dOb.fraction());
  }
}
