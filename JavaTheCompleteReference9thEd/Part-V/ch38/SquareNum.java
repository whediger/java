
import java.io.*;

/**
* This class uses documentation comments
* @author Wes Hediger
* @version 12.34.01
*/

public class SquareNum {
  /**
  * this method returns the the square of a sum
  * This is a multiline description
  * bla bla bla bal
  * @param num The value to be squared
  * @return num squared
  */
  public double square(double num){
    return num * num;
  }

  /**
  * This method nputs a number from the user
  * @return the value input as a double
  * @exception IOException on input error
  * @see IOException
  */
  public double getNumber() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String str;

    str = br.readLine();
    return (new Double(str)).doubleValue();
  }

  /**
  * This method demonstrates square
  * @param args Unused
  * @exception IOException on input error
  * @see IOException
  */
  public static void main(String args[]) throws IOException
  {
    SquareNum ob = new SquareNum();
    double val;

    System.out.println("Enter value to be squared: ");
    val = ob.getNumber();
    val = ob.square(val);

    System.out.println("Squared value is: " + val);
  }
}
