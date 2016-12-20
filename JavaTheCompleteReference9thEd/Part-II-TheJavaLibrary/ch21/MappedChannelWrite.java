
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

class MappedChannelWrite {
  public static void main(String args[])
  {
    try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test2.txt"),
                                        StandardOpenOption.WRITE,
                                        StandardOpenOption.READ,
                                        StandardOpenOption.CREATE))
    {
      //then map the file into a buffer
      MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

      for(int i = 0; i < 26; i++)
        mBuf.put((byte)('A' + i));

    } catch (InvalidPathException exc){
      System.out.println("Error: invalid path - " + exc);
    } catch (IOException exc){
      System.out.println("Error: I/O Exception - " + exc);
    }
  }
}
