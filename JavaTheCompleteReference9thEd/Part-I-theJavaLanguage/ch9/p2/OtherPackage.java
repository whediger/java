
package p2;

class OtherPackage {
  OtherPackage(){
    p1.Protection p = new p1.Protection();

    System.out.println("in OtherPackage constructor");

    //p.n is class or package only

    //p.n_pri is class only

    //p.n_pro is subclass or package only

    System.out.println("p.n_pub " + p.n_pub);
  }
}
