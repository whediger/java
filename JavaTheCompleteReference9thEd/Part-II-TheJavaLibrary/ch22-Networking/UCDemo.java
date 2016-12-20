
//create URL connection

import java.net.*;
import java.io.*;
import java.util.Date;

class UCDemo {
  public static void main(String args[]) throws Exception
  {
    int c;
    URL hp = new URL("http://www.internic.net");
    URLConnection hpCon = hp.openConnection();

    //get Date
    long d = hpCon.getDate();
    if(d==0) System.out.println("No date information");
    else System.out.println("Date: " + new Date(d));

    //get content type
    System.out.println("Content type: " + hpCon.getContentType());

    //get Expiration Date
    d = hpCon.getExpiration();
    if(d == 0) System.out.println("No Expiration information");
    else System.out.println("Exspires: " + new Date(d));

    //get last modified Date
    d = hpCon.getLastModified();
    if(d == 0) System.out.println("No last modified date");
    else System.out.println("Last Modified: " + new Date(d));

    //get conent length
    long len = hpCon.getContentLengthLong();
    if(len == 1) System.out.println("No length");
    else System.out.println("Length: " + len);

    if(len != 0){
      System.out.println("<=========]==+ CONTENT +==]========>");
      InputStream input = hpCon.getInputStream();
      while ((c = input.read()) != -1) {
        System.out.print((char) c);
      }
      input.close();
    } else System.out.println("no content available");
  }
}
