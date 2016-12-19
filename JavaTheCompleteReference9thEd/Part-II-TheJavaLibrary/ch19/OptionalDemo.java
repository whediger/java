//demonstrate several optional<T> methods

import java.util.*;

class OptionalDemo {
  public static void main(String args[])
  {
    Optional<String> noVal = Optional.empty();
    Optional<String> hasVal = Optional.of("ABCDEFG");

    if(noVal.isPresent()) System.out.println("this will not be displayed!");
    else System.out.println("noVal has No Val. ;P");

    if(hasVal.isPresent()) System.out.println("the string in hasVal is " + hasVal.get());

    String defStr = noVal.orElse("Default string");
    System.out.println(defStr);
  }
}
