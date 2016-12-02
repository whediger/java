import java.io.IOException;


class ThrowsDemo {
  public static char prompt(String str)
    throws IOException {
      System.out.println(str + ": ");
      return (char) System.in.read();
  }

  public static void main(String args[]){
    char ch;

    try {
      ch = prompt("enter a letter");
    } catch (java.io.IOException exc){
      System.out.println("I/O exception occurred");
      ch = 'X';
    }
    System.out.println("You pressed " + ch);
  }
}
