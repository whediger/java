
package MyPack;

public class Ballance {
  String name;
  Double ballance;

  public Ballance(String n, Double bal){
    name = n;
    ballance = bal;
  }

  public void show(){
    if (ballance > 0) {
      System.out.print("-->");
      System.out.println(name + " $" + ballance);
    }
  }
}
