
import java.io.*;

class BufferedInputStreamDemo {
  public static void main(String args[])
  {
    String s = "This is a &copy; copyright symbol" +
      " but this, &copy is not";

    byte buf[] = s.getBytes();

    ByteArrayInputStream in = new ByteArrayInputStream(buf);
    int c;
    boolean marked = false;

    try (BufferedInputStream bs = new BufferedInputStream(in))
    {
      while((c = bs.read()) != -1){
        switch(c){
          case '&':
            if(!marked) {
              bs.mark(32);
              marked = true;
            } else {
              marked = false;
            }
            break;
          case ';':
            if(marked){
              marked = false;
              System.out.print("(c)");
            } else System.out.print((char) c);
            break;
          case ' ':
            if(marked) {
              marked = false;
              bs.reset();
              System.out.print("&");
            } else System.out.print((char) c);
            break;
          default:
            if(!marked)
              System.out.print((char) c);
            break;
        }
      }
    } catch(IOException exc){
      System.out.println("Error: I/O - " + exc);
    }
  }
}
