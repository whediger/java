
package MyPack;

//put into own class and made public
// class Ballance {
//   String name;
//   Double ballance;
//
//   Ballance(String n, Double bal){
//     name = n;
//     ballance = bal;
//   }
//
//   void show(){
//     if (ballance > 0) {
//       System.out.print("-->");
//       System.out.println(name + " $" + ballance);
//     }
//   }
// }



class AccountBallance {
  public static void main(String args[])
  {
    Ballance current[] = new Ballance[3];

    current[0] = new Ballance("K. J. Fielding", 123.23);
    current[1] = new Ballance("humpty dumpty", 23.23);
    current[2] = new Ballance("sting ray", 1112313.23);

    for(int i = 0; i < current.length; i++) current[i].show();
  }
}
