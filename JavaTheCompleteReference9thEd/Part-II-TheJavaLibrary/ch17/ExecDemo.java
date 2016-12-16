
class ExecDemo {
  public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();
    Process p = null;

    try {
      p = r.exec("open /Applications/chess.app");
    } catch (Exception exc) {
      System.out.println("Error: Chess Not started - " + exc);
    }
  }
}
