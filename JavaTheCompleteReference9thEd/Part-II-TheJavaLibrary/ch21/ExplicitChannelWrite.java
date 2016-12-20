
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelWrite {
  public static void main(String args[])
  {
    try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"),
                                            StandardOpenOption.WRITE,
                                            StandardOpenOption.CREATE))
    {
      //create buffer
      ByteBuffer mBuf = ByteBuffer.allocate(26);

      //write some bytes to the buffer
      for(int i = 0; i < 26; i++)
        mBuf.put((byte)('A' + i));

      //reset the buffer so that it can written
      mBuf.rewind();

      //write the buffer to the output file
      fChan.write(mBuf);
    } catch (InvalidPathException exc){
      System.out.println("Error: invalid path - " + exc);
    } catch(IOException exc){
      System.out.println("Error: I/O Exception - " + exc);
    }
  }
}
