import java.io.*;

class CopyFile {
  public static void main(String args[]) throws IOException
  {
    int i;

    //make sure both files have benn specified
    if (args.length != 2) {
      System.out.println("Usage: CopyFile from to");
      return;
    }

    //Copy a file
    try (FileInputStream fin = new FileInputStream(args[0]);
          FileOutputStream fout = new FileOutputStream(args[1])) {

      do {
        i = fin.read();
        if(i != -1) fout.write(i);
      } while(i != -1);

    } catch (IOException exc){
      System.out.println("I/O Error: " + exc);
    } 
  }
}
