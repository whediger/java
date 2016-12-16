import java.util.*;


class ArrayListDemo {
  public static void main(String args[])
  {
    ArrayList<String> al = new ArrayList<String>();

    System.out.println("initial arraylist size: " + al.size());

    al.add("C");
    al.add("A");
    al.add("E");
    al.add("B");
    al.add("D");
    al.add("F");
    al.add(1, "A2");

    System.out.println("size after additions: " + al.size());

    System.out.println("contents of al: " + al);

    al.remove("F");
    al.remove(2);

    System.out.println("size after deletions: " + al.size());

    System.out.println("al contents: " + al);
  }
}
