
enum Apple {
  Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {
  public static void main(String args[])
  {
    Apple ap;

    ap = Apple.RedDel;

    //output enum value
    System.out.println("this is ap: " + ap);
    System.out.println();

    ap = Apple.GoldenDel;

    //compare two enum values
    if (ap == Apple.GoldenDel)
      System.out.println("yummy golden delish is in ap");

    //use enum in switch statement, practice switch
    switch(ap){
      case Jonathan:
        System.out.println("Jonathan is red");
        break;
      case GoldenDel:
        System.out.println("GoldenDel is delish");
        break;
      case RedDel:
        System.out.println("RedDel switch");
        break;
      case Winesap:
        System.out.println("Winesap in switch");
        break;
      case Cortland:
        System.out.println("Cortland in switch");
        break;
    }    
  }
}
