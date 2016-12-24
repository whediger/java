
import java.util.*;
import java.util.stream.*;

class NamePhoneEmail {
  String name;
  String email;
  String phoneNum;

  NamePhoneEmail(String n, String p, String e){
    name = n;
    email = e;
    phoneNum = p;
  }
}

class StreamDemo5 {
  public static void main(String args[])
  {
    //a list of name, phone, email
    ArrayList<NamePhoneEmail> myList = new ArrayList<NamePhoneEmail>();

    myList.add(new NamePhoneEmail("Larry", "777-7777", "lary@dontknow.com"));
    myList.add(new NamePhoneEmail("sallie", "222-2222", "saly@mae.gov"));
    myList.add(new NamePhoneEmail("joe", "888-8888", "joe@joe.jo"));

    System.out.println("Ogininal values in my list: ");
    myList.stream().forEach( (a) -> {
      System.out.println(a.name + " | " + a.phoneNum + " | " + a.email +"\n");
    });
  }
}
