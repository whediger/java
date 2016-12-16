
//waits until chess is terminated

class ExecDemoFini {
  public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();

    Process p = null;

    try {
      p = r.exec("open /Applications/chess.app");
      p.waitFor();
    } catch (Exception exc){
      System.out.println("Error: chess not started");
    }

    System.out.println("would you like to play another game?");
  }
}
