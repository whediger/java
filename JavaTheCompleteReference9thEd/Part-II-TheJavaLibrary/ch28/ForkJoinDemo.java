
import java.util.concurrent.*;
import java.util.*;

class SqrtTransform extends RecursiveAction {
  // The threshold value is arbitrarily set at 1,000 in this example.
  // In real-world code, its optimal value can be determined by
  // profiling and experimentation.

  final int sqrThreshold = 1000;

  double[] data;

  //determine what part of data to process
  int start, end;

  SqrtTransform(double[] vals, int s, int e){
    data = vals;
    start = s;
    end = e;
  }

  //this is the method in which parallel exicutions occur
  @Override
  protected void compute() {
    //if less than threshhold then process sequentially
    if((end - start) < sqrThreshold)
      for(int i = start; i < end; i++)
        data[i] = Math.sqrt(data[i]);
    else {
      //otherwise break data into smaller parts
      int middle = (start + end) / 2;

      //invoke new tasks using the subdevided data
      invokeAll(new SqrtTransform(data, start, middle),
                new SqrtTransform(data, middle, end));
    }
  }
}

//demonstrate parallel exicution
class ForkJoinDemo {
  public static void main(String args[])
  {
    //create a task pool
    ForkJoinPool fjp = new ForkJoinPool();

    double[] nums = new double[100000];

    //give nums some values
    for(int i = 0; i < nums.length; i++)
      nums[i] = (double) i;

    System.out.println("a portion of the original sequence:");

    for(int i = 0; i < 10; i++)
      System.out.print(nums[i] + " : ");
    System.out.println("\n");

    SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

    //start the main ForkJoinTask
    fjp.invoke(task);

    System.out.println("A portion of the transformed sequence to four decimal places: ");

    for(int i = 0; i < 10; i++)
      System.out.format("%.4f : ", nums[i]);
    System.out.println("\n");
  }
}
