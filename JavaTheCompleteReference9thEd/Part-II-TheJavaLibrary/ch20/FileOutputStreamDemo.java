
import java.io.*;

class FileOutputStreamDemo {
  public static void main(String args[])
  {
    String source = "Now is the time for all good people to " +
                    "come to the aid of their country and pay" +
                    "their taxes.";
    byte buf[] = source.getBytes();

    FileOutputStream fout0 = null;
    FileOutputStream fout1 = null;
    FileOutputStream fout2 = null;

    try {
      fout0 = new FileOutputStream("file1.txt");
      fout1 = new FileOutputStream("file2.txt");
      fout2 = new FileOutputStream("file3.txt");

      //write to first file
      for (int i = 0; i < buf.length; i +=2) fout0.write(buf[i]);

      // write to second file
      fout1.write(buf);

      //write to third file
      fout2.write(buf, buf.length/4, buf.length/4);
    } catch (IOException exc) {
      System.out.println("Error: I/O Exception");
    } finally {
      try {
        if(fout0 != null) fout0.close();
      } catch (IOException exc){
        System.out.println("Error: Closing file1");
      }
      try {
        if(fout1 != null) fout1.close();
      } catch (IOException exc){
        System.out.println("Error: closing file2");
      }
      try{
        if(fout2 != null) fout2.close();
      } catch (IOException exc) {
        System.out.println("Error: closing file3");
      }
    }
  }
}
