
import java.io.*;
import java.nio.file.*;



class NIOStreamWrite {
  public static void main(String[] args) {
    //open the file and obtain a stream linked to it
    try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt"))))
    {
      //write some bytes to the stream
      for(int i = 0; i < 26; i++)
        fout.write(('a' + i));
    } catch(InvalidPathException exc){
      System.out.println("Error: Invalid path - " + exc);
    } catch (IOException exc) {
      System.out.println("Error: I/O exception - " + exc);
    }
  }

}
