
import java.net.*;
import java.io.*;
import java.util.*;

class HttpURLDemo {
  public static void main(String args[]) throws Exception
  {
    URL hp = new URL("https://www.google.com");

    HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

    //display request method
    System.out.println("Request method is " + hpCon.getRequestMethod());

    //display response code
    System.out.println("Response code is: " + hpCon.getResponseCode());

    System.out.println("Response message: " + hpCon.getResponseMessage());

    //get list of headers and set of header keys
    Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
    Set<String> hdrField = hdrMap.keySet();

    System.out.println("\nHere is the header @8)");

    for (String k : hdrField) {
      System.out.println("key: " + k + " Value: " + hdrMap.get(k));
    }
  }
}
