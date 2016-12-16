
class deleteDemo {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("this is a test");
    sb.delete(4, 7);
    System.out.println("After Delete: " + sb);

    sb.deleteCharAt(0);
    System.out.println("after deleteCharAt() " + sb);
  }
}
