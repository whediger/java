
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChanelRead {
  public static void main(String args[])
  {
    int count;
    Path filepath = null;

    //first obtain path to the file
    try {
      filepath = Paths.get("../ch20/test.txt");
    } catch(InvalidPathException exc){
      System.out.println("Error: path - " + exc);
      return;
    }

    //next obtain a channel to that file within a  try-with-resources block
    try (SeekableByteChannel fChan = Files.newByteChannel(filepath))
    {
      //Allocate a buffer
      ByteBuffer mBuf = ByteBuffer.allocate(128);

      do {
        //read a Buffer
        count = fChan.read(mBuf);

        //stop when end of file is reached
        if(count != -1){
          //rewind the buffer so it can be re-read
          mBuf.rewind();

          //read bytes on the buffer and show them on the screen
          for (int i = 0; i < count; i++)
            System.out.print((char) mBuf.get());
        }
      } while (count != -1);
      System.out.println();
    } catch(IOException exc){
      System.out.println("Error: I/O exception - " + exc);
    }
  }
}
