
import java.io.*;

class ByteArrayInputStreamReset {
  public static void main(String args[])
  {
    String temp = "abc";
    byte b[] = temp.getBytes();

    ByteArrayInputStream bs = new ByteArrayInputStream(b);

    for (int i = 0; i < b.length; i++) {
      int c;
      while((c = bs.read()) != -1){
        if ( i == 0) System.out.print((char) c);
        else System.out.print(Character.toUpperCase((char) c));
      }
      System.out.println();
      bs.reset();
    }
  }
}
