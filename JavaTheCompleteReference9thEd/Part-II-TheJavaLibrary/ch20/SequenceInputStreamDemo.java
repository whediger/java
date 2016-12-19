
import java.io.*;
import java.util.*;

class InputStreamEnumerator implements Enumeration<FileInputStream> {
  private Enumeration<String> files;

  public InputStreamEnumerator(Vector<String> files){
    this.files = files.elements();
  }

  public boolean hasMoreElements() {
    return files.hasMoreElements();
  }

  public FileInputStream nextElement(){
    try {
      return new FileInputStream(files.nextElement().toString());
    } catch (IOException exc){
      return null;
    }
  }
}

class SequenceInputStreamDemo {
  public static void main(String args[])
  {
    int c;
    Vector<String> files = new Vector<String>();

    files.addElement("file1.txt");
    files.addElement("file2.txt");
    files.addElement("file3.txt");
    InputStreamEnumerator ise = new InputStreamEnumerator(files);
    InputStream input = new SequenceInputStream(ise);

    try {
      while((c = input.read()) != -1) {
        System.out.print((char) c);
      }
    } catch(NullPointerException exc){
        System.out.println("Error: null pointer exception  - " + exc);
    } catch(IOException exc) {
      System.out.println("Error: I/O exception  - " + exc);
    } finally {
      try {
        input.close();
      } catch (IOException exc){
        System.out.println("Error: closing InputSequenceStream");
      }
    }
  }
}
