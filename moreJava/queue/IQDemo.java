
class FixedQueue implements ICharQ {
  private char q[];//array holds the queue
  private int putLoc, getLoc;//holds the indices

  public FixedQueue(int size){
    q = new char[size]; //alocate memory for queue
    putLoc = getLoc = 0;
  }

  public void put(char ch){
    if(putLoc == q.length) {
      System.out.println(" - Queue is full.");
      return;
    }
    q[putLoc++] = ch;
  }

  public char get() {
    if(getLoc == putLoc){
      System.out.println(" - Queue is empty.");
      return (char) 0;
    }
    return q[getLoc++];
  }
}
