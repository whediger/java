
package p1;

class SamePackage {
  SamePackage() {

    Protection p = new Protection();

    System.out.println("same package contructor");
    System.out.println(" n = " + p.n);

    //private is class only

    System.out.println("n_pro = " + p.n_pro);
    System.out.println("n_pub = " + p.n_pub);
  }
}
