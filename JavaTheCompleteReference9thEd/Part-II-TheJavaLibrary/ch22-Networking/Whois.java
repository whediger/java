//use sockets
import java.net.*;
import java.io.*;

class Whois {
  public static void main(String args[]) throws Exception
  {
    int c;

    //create socket
    Socket s = new Socket("whois.internic.net", 43);

    //obtain input and output streams
    InputStream in = s.getInputStream();
    OutputStream out = s.getOutputStream();

    //construct a request String

    String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
    //convert to bytes
    byte buf[] = str.getBytes();

    //send request
    out.write(buf);

    //read and display response
    while((c = in.read()) != -1) {
      System.out.print((char) c);
    }

    s.close();
  }
}
