//simple lambda expression

//a functional interface
interface MyValue {
  double getValue();
}

//another funtional interface
interface MyParamValue {
  double getValue(double v);
}

class LambdaDemo {
  public static void main(String args[])
  {
    MyValue myVal;

    //here -> is constant expression
    myVal = () -> 98.6;

    //call getValue
    System.out.println("a constant value "+ myVal.getValue());

    //create parameterized value
    MyParamValue myPval = (n) -> 1.0 / n;

    //call getValue(v) through the myPval reference
    System.out.println("Recipricol of 4 is " + myPval.getValue(4.0));
    System.out.println("Recipricol of 8 is " + myPval.getValue(8.0));

    //lambda expression must be compatable with the method
    //defined by the functional interface  +==]========>
    //myVal = () -> "three"; //strings will not work, get it?!
  }
}
