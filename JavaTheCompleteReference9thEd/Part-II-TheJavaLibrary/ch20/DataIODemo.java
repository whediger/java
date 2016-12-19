
import java.io.*;

class DataIODemo {
  public static void main(String args[])
  {
    //first write the data
    try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.data")))
    {
      dout.writeDouble(98.6);
      dout.writeInt(42);
      dout.writeBoolean(true);
    } catch(FileNotFoundException exc){
      System.out.println("Error: File not found Exception - " + exc);
      return;
    } catch(IOException exc){
      System.out.println("I/O exception - " + exc);
    }

    //now read the data back
    try (DataInputStream din = new DataInputStream(new FileInputStream("Test.data")))
    {
      double d = din.readDouble();
      int i = din.readInt();
      boolean b = din.readBoolean();

      System.out.println("here are the values: " + d + ", " + i + ", " + b);
    } catch (FileNotFoundException exc) {
      System.out.println("Error: read error, file not found - " + exc);
      return;
    } catch(IOException exc) {
      System.out.println("Error: I/O readfile - " + exc);
    }
  }
}
