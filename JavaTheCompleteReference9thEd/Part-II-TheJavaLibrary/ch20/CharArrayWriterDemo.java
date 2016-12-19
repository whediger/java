
import java.io.*;

class CharArrayWriterDemo {
  public static void main(String args[]) throws IOException
  {
    CharArrayWriter f = new CharArrayWriter();
    String s = "This should en up in the array";
    char buf[] = new char[s.length()];

    s.getChars(0, s.length(), buf, 0);

    try {
      f.write(buf);
    }catch(IOException exc){
      System.out.println("Error: writing to buffer" + exc);
      return;
    }

    System.out.println("buffer as a string");
    System.out.println(f.toString());
    System.out.println("Into array");

    char c[] = f.toCharArray();
    for(int i = 0; i < c.length; i++)System.out.print((char) c[i]);

    System.out.println("\nTo a file writer\n");

    try(FileWriter f2 = new FileWriter("test.txt"))
    {
      f.writeTo(f2);
    } catch (IOException exc){
      System.out.println("I/O error");
    }

    System.out.println("doing reset");
    f.reset();

    for(int i = 0; i < 3; i++) f.write('X');

    System.out.println(f.toString());
  }
}
