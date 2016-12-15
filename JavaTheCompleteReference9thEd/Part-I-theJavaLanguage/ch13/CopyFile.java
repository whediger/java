
import java.io.*;

class CopyFile {
  public static void main(String args[]) throws IOException
  {
    int i;

    //first confirm both Files
    if (args.length != 2) {
      System.out.println("Usage: CopyFile <from> <to>");
      return;
    }

    //copy a file
    try (FileInputStream fin = new FileInputStream(args[0]);
          FileOutputStream fos = new FileOutputStream(args[1]);){
      do {
        i = fin.read();
        if (i != -1) fos.write(i);
      } while (1 != -1);
    } catch (IOException exc) {
      System.out.println("I/O Exception");
    }
  }
}
