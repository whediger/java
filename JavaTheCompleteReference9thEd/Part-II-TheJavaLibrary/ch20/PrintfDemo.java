
//demo printf

class PrintfDemo {
  public static void main(String args[])
  {
    System.out.println("Here are some numeric values in " +
                          "different formats.\n");
    System.out.printf("Various integer formats: ");
    System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);

    System.out.println();
    System.out.printf("Default floating-point format: %f\n", 1234567.3342);
    System.out.printf("Floating-point with commas: %,f\n", 1234567.3342);
    System.out.printf("Negative default floating-point: %,f\n", -1234567.3342);
    System.out.printf("Negative floating-point option: %,(f\n", -1234567.3342);

    System.out.println();

    System.out.printf("Line up positive and negative values:\n");
    System.out.printf("% ,.2f\n% ,.2f\n", 1234567.3342, -1234567.3342);
  }
}
