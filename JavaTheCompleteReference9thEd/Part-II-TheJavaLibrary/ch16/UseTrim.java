
import java.io.*;

class UseTrim {
  public static void main(String[] args) throws IOException
  {
      //create BufferedReader
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str;

      System.out.println("Enter 'stop' ot quit - ");
      System.out.println("Enter State: ");
      do {
        str = br.readLine();
        str = str.trim(); //removes whitespace

        if(str.equals("Illinois")) System.out.println("capital is Springfield");
        else if(str.equals("Missouri")) System.out.println("capital is Jefferson County");
        else if(str.equals("California")) System.out.println("capital is Sacramento");
        else System.out.println("I don't know that one");
      } while (!str.equals("stop"));
  }
}
