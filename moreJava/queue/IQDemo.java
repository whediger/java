
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

class CircularQueue implements ICharQ {
  private char q[];//holds the queue
  private int putLoc, getLoc; //get and put indices

  public CircularQueue(int size){
    q = new char[size+1]; //alocate memory for queue
    putLoc = getLoc = 0;
  }

  public void put(char ch){
    if(putLoc+1 == getLoc | ((putLoc == q.length-1) & (getLoc == 0))) {
      System.out.println(" - Queue is full.");
      return;
    }
    q[putLoc++] = ch;
    if(putLoc == q.length) putLoc = 0; //loop back
  }

  public char get(){
    if(getLoc == putLoc){
      System.out.println(" - Queue is empty.");
      return (char) 0;
    }

      char ch = q[getLoc++];
      if(getLoc == q.length) getLoc = 0;
      return ch;
  }
}
