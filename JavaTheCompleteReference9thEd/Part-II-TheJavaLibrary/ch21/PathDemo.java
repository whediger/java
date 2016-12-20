
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

class PathDemo {
  public static void main(String[] args) {
    Path filepath = Paths.get("test.txt");

    // System.out.println("Filename: " + filepath.getName(1));
    System.out.println("Path: " + filepath);
    System.out.println("Absolute path: " + filepath.toAbsolutePath());
    System.out.println("Parent " + filepath.getParent());

    if(Files.exists(filepath)) System.out.println("File exists");
    else System.out.println("File does not exist");

    try {
      if(Files.isHidden(filepath))
        System.out.println("File is hidden");
      else System.out.println("File is NOT hidden");
    } catch (IOException exc){
      System.out.println("Error: I/O excpetion - " + exc);
    }

    Files.isWritable(filepath);
    System.out.println("file is writable");

    Files.isReadable(filepath);
    System.out.println("file is readable");

    try {
      BasicFileAttributes attribs = Files.readAttributes(filepath, BasicFileAttributes.class);

      if(attribs.isDirectory())
        System.out.println("File is a directory");
      else System.out.println("file is not a directory");

      if(attribs.isRegularFile())
        System.out.println("file is regular file");
      else System.out.println("File is some strange file");

      if(attribs.isSymbolicLink())
        System.out.println("File is symbolic link");
      else System.out.println("file is not a symbolic link");

      System.out.println("file last modified " + attribs.lastModifiedTime());
      System.out.println("File size: " + attribs.size() + " bytes");
    } catch(IOException exc) {
      System.out.println("Error: I/O exception - " + exc);
    }
  }
}
