
public class QueueFullException(int s) extends Exception {
  int size;

  QueueFullException(int s) { size = s; }

  public String toString() {
    return "\nQueue is full. Maximum size is " + size;
  }
}
