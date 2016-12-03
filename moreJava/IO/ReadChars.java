//use a buffer read to read chars from console
import java.io.*;

class ReadChars {
  public static void main(String args[])
    throws IOException
  {
    char c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter charecters, period to quit.");

    //read charecters
    do {
      c = (char) br.read();
      System.out.println(c);
    } while (c != '.');
  }
}
