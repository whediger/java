
import java.util.concurrent.*;

class CallableDemo {
  public static void main(String args[])
  {
    ExecutorService ex = Executors.newFixedThreadPool(3);
    Future<Integer> f;
    Future<Double> f2;
    Future<Integer> f3;

    System.out.println("Starting");

    f = ex.submit(new Sum(10));
    f2 = ex.submit(new Hypot(3, 4));
    f3 = ex.submit(new Factorial(5));

    try{
      System.out.println(f.get(2000, TimeUnit.MILLISECONDS));
      System.out.println(f2.get());
      System.out.println(f3.get(10, TimeUnit.MILLISECONDS));
    }catch(InterruptedException exc){
      System.out.println(exc);
    }catch(ExecutionException exc){
      System.out.println(exc);
    }catch(TimeoutException exc){
      System.out.println(exc);
    }

    ex.shutdown();
    System.out.println("done  +==]========>");
  }
}

class Sum implements Callable<Integer>{
  int stop;

  Sum(int n){
    stop = n;
  }

  public Integer call(){
    int sum = 0;
    for(int i = 0; i < stop; i++)
      sum += i;
    return sum;
  }
}

class Hypot implements Callable<Double>{
  double side1, side2;

  Hypot(double s1, double s2){
    side1 = s1;
    side2 = s2;
  }

  public Double call(){
    return Math.sqrt((side1*side1) + (side2*side2));
  }
}

class Factorial implements Callable<Integer> {
  int stop;

  Factorial(int n){
    stop = n;
  }

  public Integer call(){
    int fact = 1;

    for (int i = 1; i < stop; i++) {
      fact *= i;
    }
    return fact;
  }

}
