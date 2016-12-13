
import java.io.*;

class CopyFile {
  public static void main(String args[]) throws IOException
  {
    int i;
    FileInputStream fin = null;
    FileOutputStream fos = null;

    //first confirm both Files
    if (args.length != 2) {
      System.out.println("Usage: CopyFile <from> <to>");
      return;
    }

    //copy a file
    try {
      //attempt to open Files
      fin = new FileInputStream(args[0]);
      fos = new FileOutputStream(args[1]);

      do {
        i = fin.read();
        if (i != -1) fos.write(i);
      } while (1 != -1);
    } catch (IOException exc) {
      System.out.println("I/O Exception");
    } finally {
      try {
        if (fin != null) fin.close();
      } catch (IOException exc){
        System.out.println("Error: Closing input file");
      }
      try{
        if(fos != null) fos.close();
      } catch (IOException exc){
        System.out.println("Error: Closing output file");
      }
    }
  }
}
