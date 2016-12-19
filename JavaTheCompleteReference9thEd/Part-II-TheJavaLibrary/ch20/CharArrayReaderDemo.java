
import java.io.*;

public class CharArrayReaderDemo {
  public static void main(String args[])
  {
    String tmp = "abcedfghijklmnopqrstuvwxyz";
    int length = tmp.length();
    char c[] = new char[length];

    tmp.getChars(0, length, c, 0);
    int i;

    try (CharArrayReader input1 = new CharArrayReader(c))
    {
      System.out.print("input1 is: ");
      while((i = input1.read()) != -1){
        System.out.print((char) i);
      }
      System.out.println();
    } catch(IOException exc){
      System.out.println("Error: I/O Excption - " + exc);
    }

    try (CharArrayReader input2 = new CharArrayReader(c, 0, 5))
    {
      System.out.println("input2 is: ");
      while((i = input2.read()) != -1){
        System.out.print((char)i);
      }
      System.out.println();
    } catch (IOException exc){
      System.out.println("I/O Error - " + exc);
    }
  }
}
