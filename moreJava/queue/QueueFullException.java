
public class QueueFullException extends RuntimeException {
  int size;

  QueueFullException(int s) { size = s; }

  public String toString() {
    return "\nQueue is full. Maximum size is " + size;
  }
}
