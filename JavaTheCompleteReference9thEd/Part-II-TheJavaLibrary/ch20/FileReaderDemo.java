
import java.io.*;

class FileReaderDemo {
  public static void main(String args[])
  {
    try (FileReader fr = new FileReader("FileReaderDemo.java"))
    {
      int c;

      //read and display this file
      while((c = fr.read()) != -1) System.out.print((char) c);
    } catch(IOException exc) {
      System.out.println("Error: IOException - " + exc);
    }
  }
}
