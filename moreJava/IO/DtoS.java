//to read from a file

import java.io.*;

class DtoS {
  public static void main(String args[])
  {
    String s;

    //create and use a FileReader wrapped in a BufferedReader
    try (BufferedReader br = new BufferedReader(new FileReader("test.txt")))
    {
      while ((s = br.readLine()) != null) {
        System.out.println(s);
      }
    } catch(IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}
