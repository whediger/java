
class Stats<T extends Number> {
  T[] nums;

  Stats(T[] t){
    nums = t;
  }

  double average() {
    double sum = 0.0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i].doubleValue();
    }
    return sum / nums.length;
  }

  //   +==]========>
  //this uses the wild card - <?>
  boolean sameAvg(Stats<?> ob) {
    if (average() == ob.average()) return true;
    else return false;
  }
}

class WildCardDemo {
  public static void main(String args[])
  {
    Integer inums[] = { 1,2,3,4,5,6,7 };
    Stats<Integer> iob = new Stats<Integer>(inums);
    double v = iob.average();
    System.out.println("iob avarage is " + iob);

    Double dnums[] = { 1.0,2.0,3.0,4.0,5.0,6.0,7.0 };
    Stats<Double> dob = new Stats<Double>(dnums);
    double d = dob.average();
    System.out.println("doube average is " + d);

    Float fnms[] = {1.0f,2.0f,3.0f,4.0f,5.0f,6.0f,7.0f};
    Stats<Float> fob = new Stats<Float>(fnms);
    Double fn = fob.average();
    System.out.println("Float average is " + fn);

    //check which have same averages
    System.out.println("averages of iob and dob -- ");
    if (iob.sameAvg(dob)) {
      System.out.println("are the same");
    } else System.out.println("differ");

    System.out.println("averages of iob and fob");
    if(fob.sameAvg(iob)) System.out.println("are the same");
    else System.out.println("they differ");
  }
}
