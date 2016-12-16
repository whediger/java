
class Elapsed {
  public static void main(String args[])
  {
    long start, end;

    System.out.println("Timing a for loop 0 to 100,000,000");

    start = System.currentTimeMillis();
    for(long i = 0; i < 100000000L; i++);
    end = System.currentTimeMillis();

    System.out.println("time it took: " + (end - start) + " millisecs");
  }
}
