
import java.io.*;

class BufferedReaderDemo {
  public static void main(String args[])
  {
    String s = "This is a &copy; copywrite symbol " +
                "but this is &copy is not.\n";
    char buf[] = new char[s.length()];
    s.getChars(0, s.length(), buf, 0);

    CharArrayReader in = new CharArrayReader(buf);
    int c;
    boolean marked = false;

    try(BufferedReader f = new BufferedReader(in))
    {
      while((c = f.read()) != -1){
        switch(c) {
          case '&':
            if(!marked) {
              f.mark(32);
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
            if(marked){
              marked = false;
              f.reset();
              System.out.print("&");
            } else System.out.print((char) c);
            break;
          default:
            if (!marked) System.out.print((char) c);
            break;
        }
      }
    } catch (IOException exc){
      System.out.println("Error: I/O exception - " + exc);
    }
  }
}