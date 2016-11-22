

public class Rational {

  private int numerator;
  private int denominator;

  public Rational(){
    this.numerator = 0;
    this.denominator = 1;
  }

  public Rational(int n, int d){
    this.numerator = n;
    this.denominator = d;
  }

  private void negate(){
    this.numerator *= (-1);
  }

  private void invert(){
    int temp = this.numerator;
    if (temp < 0){
      temp *= (-1);
      this.denominator *= (-1);
    }
    this.numerator = this.denominator;
    this.denominator = temp;
  }

  private double toDouble(){
    return (double)this.numerator / (double) this.denominator;
  }

  private void printRational(){
    System.out.println("This Rational number: " + this.numerator + "/" + this.denominator);
  }

  public String toString(){
    return String.format("%d/%d", this.numerator, this.denominator);
  }

  private int reduce(int n, int d){
    if (d == 0){ return n; };
    return reduce(d, (n%d));
  }


  //  +===]========>
  public static void main(String[] args){

    Rational rash = new Rational();
    rash.printRational();
    System.out.println(rash.toString());
    Rational rash2 = new Rational(1, 3);
    rash2.negate();
    System.out.println(rash2.toDouble());
    System.out.println(rash2.toString());
    rash2.invert();
    System.out.println(rash2.toString());
    Rational euclid = new Rational();
    System.out.println(euclid.reduce(1071, 462));

  }
}
