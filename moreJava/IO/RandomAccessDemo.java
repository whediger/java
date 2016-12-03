//Demonstrate random access files

import java.io.*;

class RandomAccessDemo {
  public static void main(String args[])
  {
    double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74,25 };
    double d;

    //display original array
    System.out.print("Array: { ");
    for(double num : data) System.out.print(num + ", ");
    System.out.print("}");
    System.out.println();

    //open and use random access file
    try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw"))
    {
      // write values to the file
      for(int i = 0; i < data.length; i++) raf.writeDouble(data[i]);

      //now read back the values
      raf.seek(0); //seek to the first double
      d = raf.readDouble();
      System.out.println("first value is " + d);

      raf.seek(8); //seek to second double
      d = raf.readDouble();
      System.out.println("second value is: " + d);

      raf.seek(8 * 3); //seek the fourth double
      d = raf.readDouble();
      System.out.println("the fourth double is: " + d);

      System.out.println();

      //now read every other value
      System.out.println("here is every other value: ");
      for (int i = 0; i < data.length; i+=2) {
        raf.seek(8 * i);//seek to nth value
        d = raf.readDouble();
        System.out.println(d + " ");
      }
    } catch(IOException exc) {
      System.out.println("I/O error: " + exc);
    }
  }
}
