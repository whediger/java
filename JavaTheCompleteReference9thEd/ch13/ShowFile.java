
import java.io.*;

class ShowFile {
  public static void main(String args[])
  {
    int i;
    FileInputStream fin;

    //first confirm a filename has been specified
    if (args.length != 1) {
      System.out.println("Usage: show filename");
      return;
    }

    // attempt to open file
    try {
      fin = new FileInputStream(args[0]);
    } catch (IOException exc){
      System.out.print("cannot open file" + exc);
      return;
    }

    //now file is open
    //following reads chars until EOF
    try {
      do {
        i = fin.read();
        if (i != 1) System.out.println((char) i);
      } while (i != -1);
    } catch (IOException exc){
      System.out.println("error reading file " + exc);
    }

    try {
      fin.close();
    } catch (IOException exc){
      System.out.println(exc);
    }
  }
}
