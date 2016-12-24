//create a list and a Set from a stream

import java.util.*;
import java.util.stream.*;

class NamePhoneEmail {
  String name;
  String phone;
  String email;

  NamePhoneEmail(String n, String p, String e){
    name = n;
    phone = p;
    email = e;
  }
}

class NamePhone {
  String name;
  String phone;

  NamePhone(String n, String p){
    name = n;
    phone = p;
  }
}

class StreamDemo7 {
  public static void main(String args[])
  {
    ArrayList<NamePhoneEmail> myList = new ArrayList<NamePhoneEmail>();

    myList.add(new NamePhoneEmail("bla", "9047", "email"));
    myList.add(new NamePhoneEmail("junk", "fakephone", "fakeemail"));
    myList.add(new NamePhoneEmail("honest", "555-1212", "honest.williams@gmail.com"));

    //map just the names and phone numbers to a new  stream
    Stream<NamePhone> nameAndPhone = myList.stream().map( (a) -> new NamePhone(a.name, a.phone));

    List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());

    System.out.println("names and phonenumbers in list: ");
    for(NamePhone e : npList)
      System.out.println(e.name + " : " + e.phone);

    //obtain another mapping of the names and phone numbers
    nameAndPhone = myList.stream().map( (a) -> new NamePhone(a.name, a.phone));

    //now create a Set by use of collect
    Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());

    System.out.println("new set of names and phone numbers: ");
    for(NamePhone np : npSet)
      System.out.println(np.name + " : " + np.phone);
  }
}
