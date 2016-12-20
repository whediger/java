
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelRead {
  public static void main(String args[])
  {
    //obtain a channel to a file within a try-with-resources block
    try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("../ch20/test.txt")))
    {
      //get the size of the file
      long fSize = fChan.size();

      //now map the file into the buffer
      MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

      //read and display bites from buffer
      for(int i = 0; i < fSize; i++)
        System.out.print((char)mBuf.get());

      System.out.println();
    } catch(InvalidPathException exc){
      System.out.println("Error: invalid path -  " + exc);
    } catch(IOException exc) {
      System.out.println("Error: I/O exception - " + exc);
    }
  }
}
