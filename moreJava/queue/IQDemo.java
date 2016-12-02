class IQDemo {
  public static void main(String args[]){
    FixedQueue fixQ1 = new FixedQueue(10);
    DynQueue dynQ2 = new DynQueue(5);
    CircularQueue cirQ3 = new CircularQueue(10);

    ICharQ iQ;

    char ch;
    int i;
    iQ = fixQ1;

    //fill fixQ1
    for(i = 0; i < 10; i++) iQ.put((char) ('A' + i));

    System.out.print("Contents of FixedQ: ");
    for (i = 0; i < 10; i++) {
      ch = iQ.get();
      System.out.print(ch);
    }
    System.out.println();

    iQ = dynQ2;
    for(i = 0; i < 10; i++) iQ.put((char) ('Z' - i));

    System.out.print("contents of dynamic Q: ");
    for (i = 0; i < 10; i++) {
      ch = iQ.get();
      System.out.print(ch);
    }
    System.out.println();

    iQ = cirQ3;
    for(i = 0; i < 10; i++) iQ.put((char) ('A' + i));

    System.out.print("contents of CircularQueue: ");
    for (i = 0; i < 10; i++) {
      ch = iQ.get();
      System.out.print(ch);
    }
    System.out.println();

    //put more chars in CircularQueue
    for(i = 10; i < 20; i++) iQ.put((char) ('A' + i));

    //show CircularQueue again
    System.out.print("contents of circularQ: ");
    for (i = 0; i < 10; i++) {
      ch = iQ.get();
      System.out.print(ch);
    }
    System.out.println("\nStore and consume from circular queue.");

    for (i = 0; i < 20; i++) {
      iQ.put((char) ('A' + i));
      ch = iQ.get();
      System.out.print(ch);
    }
  }
}

// +==]========>

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

// +==]========>

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

// +==]========>

class DynQueue implements ICharQ {
  private char q[]; //holds the queue
  private int putLoc, getLoc; //get and put indices

  public DynQueue(int size){
    q = new char[size];//the Queue
    putLoc = getLoc = 0; //set indices
  }

  public void put(char ch){
    if(putLoc == q.length){
      char t[] = new char[q.length * 2];

      for (int i = 0; i < q.length; i++) t[i] = q[i];

      q = t;
    }
    q[putLoc++] = ch;
  }

  public char get(){
    if (getLoc == putLoc) {
      System.out.println(" - Queue is empty.");
      return (char) 0;
    }
    return q[getLoc++];
  }
}
