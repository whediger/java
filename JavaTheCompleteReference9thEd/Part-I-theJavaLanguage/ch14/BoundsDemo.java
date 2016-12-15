
class Stats<T extends Number> {
  T[] nums;

  Stats(T[] o){
    nums = o;
  }

  double average() {
    double sum = 0.0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i].doubleValue();
    }
    return sum / nums.length;
  }
}

class BoundsDemo {
  public static void main(String args[])
  {
    Integer inums[] = { 1,2,3,4,5,6,7 };
    Stats<Integer> iob = new Stats<Integer>(inums);
    double v = iob.average();
    System.out.println("iob average is: " + v);

    Double dnums[] = { 1.0,2.0,3.0,4.0,5.0,6.0,7.0 };
    Stats<Double> dob = new Stats<Double>(dnums);
    double d = dob.average();
    System.out.println("double average is " + d);

    //will not compile the following type stuff--
    // String str[] = "1,2,3,4,5,6,7";
    // Stats<String> str = new Stats<String>(str);

  }
}
