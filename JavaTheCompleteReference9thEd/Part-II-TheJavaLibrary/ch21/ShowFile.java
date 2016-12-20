
import java.io.*;
import java.nio.file.*;

class ShowFile {
  public static void main(String args[])
  {
    int i;

    //first, confirm that a filename has been specified
    if(args.length != 1){
      System.out.println("Useage: java ShowFile <filename>");
      return;
    }

    //open file and obtain a stream to it
    try (InputStream fin = Files.newInputStream(Paths.get(args[0])))
    {
      do {
        i = fin.read();
        if(i != -1) System.out.print((char) i);
      } while (i != -1);
    } catch(InvalidPathException exc){
      System.out.println("Error: invalid path - " + exc);
    } catch(IOException exc){
      System.out.println("Error: I/O Exception - " + exc);
    }
  }
}
