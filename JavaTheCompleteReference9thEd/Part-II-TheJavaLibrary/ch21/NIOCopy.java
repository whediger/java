
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

class NIOCopy {
  public static void main(String args[])
  {
    if(args.length != 2){
      System.out.println("Useage: NIOCopy <from> <to>");
      return;
    }

    try {
      Path source = Paths.get(args[0]);
      Path target = Paths.get(args[1]);

      //copy the file
      Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    } catch (InvalidPathException exc) {
      System.out.println("Error: Invalid Path - " + exc);
    } catch (IOException exc){
      System.out.println("Error: IOException - " + exc);
    }
  }
}
