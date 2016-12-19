
import java.io.*;

class PushbackInputStreamDemo {
  public static void main(String args[])
  {
    String s = "if(a == 4) a = 0;\n";
    byte buf[] = s.getBytes();
    ByteArrayInputStream in = new ByteArrayInputStream(buf);
    int c;

    try (PushbackInputStream ps = new PushbackInputStream(in))
    {
      while((c = ps.read()) != -1) {
        switch(c) {
          case '=':
            if((c = ps.read()) == '=')
              System.out.print(".eq.");
            else {
              System.out.print("<-");
              ps.unread(c);
            }
            break;
          default:
            System.out.print((char) c);
            break;
        }
      }
    } catch (IOException exc){
      System.out.println("Error: I/O exception - " + exc);
    }
  }
}
