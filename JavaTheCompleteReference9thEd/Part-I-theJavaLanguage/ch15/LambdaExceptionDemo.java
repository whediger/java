
//throw exception from lambda expression

interface DoubleNumericArrayFunc {
  double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
  EmptyArrayException() {
    super("Array Empty, NG - No Good -");
  }
}

class LambdaExceptionDemo {
  public static void main(String args[]) throws EmptyArrayException
  {
    double values[] = {0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0};

    //this block lambda  computes the average of an array of doubles
    DoubleNumericArrayFunc average = (n) -> {
      double sum = 0;

      if(n.length == 0) throw new EmptyArrayException();

      for (int i = 0; i < n.length; i++) sum += n[i];

      return sum / n.length;
    };

    System.out.println("average of values is: " + average.func(values));
  }
}
