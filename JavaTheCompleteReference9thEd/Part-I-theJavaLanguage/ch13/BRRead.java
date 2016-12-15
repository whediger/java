
import java.io.*;

class BRRead {
  public static void main(String args[])
  {
    char c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input chars, 'q' to quit");

    //read chars
    try {
      do {
        c = (char) br.read();
        System.out.print(c);
      } while (c != 'q');
    } catch (IOException exc){
      System.out.println("IO Exception - " + exc);
    }

  }
}
