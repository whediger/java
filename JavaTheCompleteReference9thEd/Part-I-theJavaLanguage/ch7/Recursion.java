//standard fact recursive function

class Factorial {
  int fact(int n){
    int result;

    if(n==1) return 1;
    result = fact(n -1) * n;
    return result;
  }
}

class Recursion {
  public static void main(String args[])
  {
    Factorial f = new Factorial();

    System.out.println("factorial of 3 is " + f.fact(3));
    System.out.println("factorial of 4 is " + f.fact(4));
    System.out.println("factorial of 25 is " + f.fact(25));
  }
}
