
import java.io.*;

class BRReadLines {
  public static void main(String args[])
  {
    //create buffered reader using System.in
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str;
    System.out.println("Entr lines of Text");
    System.out.println("Enter 'stop' to quit");


      try {
        do {
          str = br.readLine();
          System.out.println(str);
        } while (!str.equals("stop"));
      } catch(IOException exc)
      { System.out.println(exc); }


  }
}
