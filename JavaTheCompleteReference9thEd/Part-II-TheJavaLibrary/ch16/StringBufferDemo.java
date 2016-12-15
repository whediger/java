
//string buffer -vs- capaity

class StringBufferDemo {
  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer("Hello");

    System.out.println("Buffer = " + sb);
    System.out.println("length = " + sb.length());
    System.out.println("capacity = " + sb.capacity());
  }
}
