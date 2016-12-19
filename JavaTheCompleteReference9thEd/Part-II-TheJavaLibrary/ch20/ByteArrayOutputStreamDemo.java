
import java.io.*;

class ByteArrayOutputStreamDemo {
  public static void main(String[] args) {
    ByteArrayOutputStream bout = new ByteArrayOutputStream();
    String str = "This should end up in an array";
    byte buf[] = str.getBytes();

    try{
      bout.write(buf);
    } catch(IOException exc){
      System.out.println("Error: Writing to buffer exception");
      return;
    }

    System.out.println("Buffer as a string");
    System.out.println(bout.toString());
    System.out.println("Into Array ");
    byte b[] = bout.toByteArray();
    for(int i = 0; i < b.length; i++) System.out.print((char) b[i]);

    System.out.println("\nTo an output stream");

    try(FileOutputStream fout = new FileOutputStream("test.txt")){
      bout.writeTo(fout);
    } catch(IOException exc){
      System.out.println("Error: FileOutputStream - " + exc);
      return;
    }

    System.out.println("doing reset");
    bout.reset();

    for(int i = 0; i < 3;  i++) bout.write('X');

    System.out.println(bout.toString());
  }
}
