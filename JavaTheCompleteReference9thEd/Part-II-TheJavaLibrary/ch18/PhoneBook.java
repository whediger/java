
import java.io.*;
import java.util.*;

class PhoneBook {
  public static void main(String args[]) throws IOException
  {
    Properties ht = new Properties();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name, number;
    FileInputStream fin = null;
    boolean changed = false;

    //try to open a phonebook.dat file
    try {
      fin = new FileInputStream("phonebook.dat");
    } catch(FileNotFoundException exc){
      // --- ignore error. +==]========>
    }

    //if phonebook file exists, open dat file
    try {
      if(fin != null) {
        ht.load(fin);
        fin.close();
      }
    } catch (IOException exc){
      System.out.println("Error: read file exception.");
    }

    //let user enter new names and numbers
    do {
      System.out.println("Enter new name - 'quit' to stop ");
      name = br.readLine();
      if(name.equals("quit")) continue;
      System.out.println("enter number: ");
      number = br.readLine();

      ht.put(name, number);
      changed = true;
    } while (!name.equals("quit"));

    //if phonebook data has changed save it
    if(changed) {
      FileOutputStream fout = new FileOutputStream("phonebook.dat");

      ht.store(fout, "Telephone Book");
      fout.close();
    }

    //lookup numbers given a name
    do {
      System.out.print("Enter a name to find ('quit' to exit): ");
      name = br.readLine();
      if(name.equals("quit")) continue;

      number = (String) ht.get(name);
      System.out.println(number);
    }while(!name.equals("quit"));
  }
}
