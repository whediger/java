//lambda that throws exception
import java.io.*;

interface MyIOAction {
  boolean ioAction(Reader rdr) throws IOException;
}

class LambdaExceptionDemo {
  public static void main(String args[])
  {
    double[] calues = { 1.0, 2.0,3.0,4.0 };

    //=> throws exception, so must be enclosed in throws clause
    MyIOAction myIO = (rdr) -> {
      int ch = rdr.read(); //could throw exception
      return true;
    };
  }
}
