
class FixedQueue implements ICharQ {
  private char q[]; //holds the Queue
  private int putLoc, getLoc; //put and get indices

  public FixedQueue(int size) {
    q = new char[size]; //allocate memory for Queue
    putLoc = getLoc = 0;
  }

  public void put(char ch)
    throws QueueFullException {

    if (putLoc == q.length)
      throw new QueueFullException(q.length);

    q[putLoc++] = ch;
  }

  public char get() throws QueueEmptyException {
    if(getLoc == putLoc)
      throw new QueueEmptyException();

    return q[getLoc++];
  }
}
