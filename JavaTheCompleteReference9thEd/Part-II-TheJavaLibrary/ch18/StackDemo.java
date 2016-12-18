
import java.util.*;

class StackDemo {
  static void showPush(Stack<Integer> st, int a){
    st.push(a);
    System.out.println("push("+a+")");
    System.out.println("stack: " + st);
  }

  static void showPop(Stack<Integer> st) {
    System.out.print("pop -> ");
    Integer a = st.pop();
    System.out.println(a);
    System.out.println("Stack: " + st);
  }

  public static void main(String args[])
  {
    Stack<Integer> st = new Stack<Integer>();

    System.out.println("stack: " + st);

    showPush(st, 42);
    showPush(st, 77);
    showPush(st, 33);
    showPop(st);
    showPop(st);
    showPop(st);

    try {
      showPop(st);
    } catch(EmptyStackException exc){
      System.out.println("Error: Empty Stack - " + exc);
    }
  }
}
