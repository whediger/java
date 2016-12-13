
import java.io.*;

class ShowFile {
  public static void main(String args[])
  {
    int i;
    FileInputStream fin = null;

    //first, confirm file name
    if (args.length != 1) {
      System.out.println("Usage: ShowFile <filename>");
      return;
    }

    //following opens a file and reads chars until EOF
    try {
      fin = new FileInputStream(args[0]);

      do {
        i = fin.read();
        if(i != -1) System.out.print((char) i);
      } while (i != -1);
    } catch (FileNotFoundException exc) {
      System.out.println("Error: No such file");
    } catch (IOException exc){
      System.out.println("Error: IO Exception");
    } finally {
      //close file in any case
      try {
        if(fin != null) fin.close();
      } catch (IOException exc){
        System.out.println("Error: Closing file");
      }
    }
  }
}
