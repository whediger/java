//a generic fixed size queue class

class GenQueue<T> implements IGenQ<T> {
  private T q[]; //this array holds the queue
  private int putLoc, getLoc; //holds get and put indices

  //construct an empty que with the given array
  public GenQueue(T[] aRef){
    q = aRef;
    putLoc = getLoc = 0;
  }

  //put an item int o the queue
  public void put(T obj) throws QueueFullException {
    if(putLoc == q.length)
      throw new QueueFullException(q.length);

    q[putLoc++] = obj;
  }

  //Get a char form the queue
  public T get() throws QueueEmptyException {
    if(getLoc == putLoc)
      throw new QueueEmptyException();

    return q[getLoc++];
  }
}
