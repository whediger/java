
import java.io.File;

class FileDemo {
  static void p(String str){
    System.out.println(str);
  }

  public static void main(String args[])
  {
    File f1 = new File("/java/COPYRIGHT");
    p("File name: " + f1.getName());
    p("Path: " + f1.getPath());
    p("Abs path: " + f1.getAbsolutePath());
    p("Parent: " + f1.getParent());
    p(f1.exists() ? "exists" : "does not exist");
    p(f1.canWrite() ? "can write" : "cannot write");
    p(f1.canRead() ? "can read" : "cannot read");
    p("is " + (f1.isDirectory() ? "" : "not " + "a directory"));
    p(f1.isFile() ? "is a normal file" : "may be named a pipe");
    p(f1.isAbsolute() ? "is absolute" : "is not absolute");
    p("File last modified: " + f1.lastModified());
    p("File size: " + f1.length() + " Bytes");
  }
}
