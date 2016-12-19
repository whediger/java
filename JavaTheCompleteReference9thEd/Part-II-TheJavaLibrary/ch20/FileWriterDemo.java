
import java.io.*;

class FileWriterDemo {
  public static void main(String args[])
  {
    String source = "Now is the time for all good poeple" +
                    " to come to the aid of their country" +
                    " and pay their taxes.";

    char buffer[] = new char[source.length()];
    source.getChars(0, source.length(), buffer, 0);

    try (FileWriter f0 = new FileWriter("file1.txt");
          FileWriter f1 = new FileWriter("file2.txt");
          FileWriter f2 = new FileWriter("file3.txt"))
    {
      //write to first file
      for (int i = 0; i < buffer.length; i += 2) {
        f0.write(buffer[i]);
      }

      //write to second file
      f1.write(buffer);

      //write to third file
      f2.write(buffer, buffer.length - buffer.length/4, buffer.length/4);
    } catch (IOException exc){
      System.out.println("Error: write to files - " + exc);
    }
  }
}
