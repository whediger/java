
import java.util.*;

class Address {
  private String name;
  private String street;
  private String city;
  private String state;
  private String code;

  Address(String n, String str, String ci, String sta, String co){
    name = n;
    street = str;
    city = ci;
    state = sta;
    code = co;
  }

  public String toString() {
    return name + ", " + street + ", " + city  + ", " + state  + ", " + code;
  }
}


class MailList {
  public static void main(String args[])
  {
    LinkedList<Address> ml = new LinkedList<Address>();

    ml.add(new Address("jane doe", "123 washinton st.", "hanesville", "AZ", "90231"));
    ml.add(new Address("gary whilhelm", "58 sea crest dr.", "beachside", "FL", "00771"));
    ml.add(new Address("Joe Shmoe", "98 main st.", "breakenridge", "CO", "80231"));


    for(Address element : ml) System.out.println(element);

    System.out.println();
  }
}
