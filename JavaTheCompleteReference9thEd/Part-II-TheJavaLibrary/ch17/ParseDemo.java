
import java.io.*;

class ParseDemo {
  public static void main(String[] args) throws IOException
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str;
      int i = 0;
      int sum = 0;

      System.out.println("Enter numbers, 0 to quit");
      do {
        str = br.readLine();
        try {
          i = Integer.parseInt(str);
        } catch (NumberFormatException exc) {
          System.out.println("Invalid Format");
        }
        sum += i;
        System.out.println("Current sum: " + sum);
      } while (i != 0);
  }
}
