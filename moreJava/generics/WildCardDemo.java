
//use a wildcard
class NumericFns<T extends Number> {
  T num;

  //pass the ocnstructor a reference to a number object
  NumericFns(T n){
    num = n;
  }

  //return the reciprocal
  double reciprocal() {
    return 1 / num.doubleValue();
  }

  //return the fractional component
  double fraction() {
    return num.doubleValue() - num.intValue();
  }

  //determine if the absolute value of two objects are the same
  boolean absEqual(NumericFns<?> ob) {
    if(Math.abs(num.doubleValue()) ==
            Math.abs(ob.num.doubleValue())) return true;
    return false;
  }
}


//Demonstrate wildcard
class WildCardDemo {
  public static void main(String args[])
  {
    NumericFns<Integer> iOb = new NumericFns<Integer>(6);
    NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
    NumericFns<Long> lOb = new NumericFns<Long>(5L);

    System.out.println("Testing iOb and dOb...");
    if(iOb.absEqual(dOb)) System.out.println("values equal");
    else System.out.println("values differ");

    System.out.println();

    System.out.println("testing iOb and lOb...");
    if(iOb.absEqual(lOb)) System.out.println("values equal");
    else System.out.println("values not equal");
  }
}
