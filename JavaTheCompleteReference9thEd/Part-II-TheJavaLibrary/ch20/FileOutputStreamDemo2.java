
import java.io.*;

class FileOutputStreamDemo2 {
  public static void main(String args[])
  {
    String source = "Now is the time for all good people to " +
                    "come to the aid of their country and pay " +
                    "their taxes.";

    byte buf[] = source.getBytes();

    //Use-with-try-with-resources
    try (FileOutputStream fs0 = new FileOutputStream("file1.txt");
        FileOutputStream fs1 = new FileOutputStream("file2.txt");
        FileOutputStream fs2 = new FileOutputStream("file3.txt"))
    {
      //write to first file
      for(int i = 0; i < buf.length; i++) fs0.write(buf[i]);

      //write to second file
      fs1.write(buf);

      //write to third file
      fs2.write(buf, buf.length/4, buf.length/4);
    } catch (IOException exc){
      System.out.println("Error: I/O stream");
    }
  }
}
