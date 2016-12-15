
interface MyNumber {
  double getValue();
}

class LambdaDemo {
  public static void main(String args[])
  {
    MyNumber myNum; //declair interface reference

    //here it is a constant expression. When assigned to MyNum, a
    //class instance is constructed in whichthe lambda expression impliments
    //the getValue() method in MyNumber.
    myNum = () -> 123.45;

    //call getValue() provided by previously assigned ;ambda expression
    System.out.println("A fixed value " + myNum.getValue());

    //here a more complicated expression is used
    myNum = () -> Math.random() * 100;

    System.out.println("random num: " + myNum.getValue());
    System.out.println("random num: " + myNum.getValue());

    //lambda must be compatable with the signiture in the functional interface
    // myNum = () -> "123.45";
  }
}
