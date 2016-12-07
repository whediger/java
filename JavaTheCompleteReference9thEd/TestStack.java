
//this class defines an integer sstack that holds 10 values

class Stack {
  int stack[] = new int[10];
  int tos;

  //init top of Stack
  Stack(){
    tos = -1;
  }

  //push to Stack
  void push(int num) {
    if(tos >= 9)
      System.out.println("stack over-full error! (ha)");
    else
      stack[++tos] = num;
  }

  int pop(){
    if(tos < 0){
      System.out.println("stack MT");
      return 0;
    }
    else
      return stack[--tos];
  }
}

class TestStack {
  public static void main(String args[])
  {
    Stack myStack = new Stack();
    Stack myStack2 = new Stack();

    //push nums on stack
    for (int i = 0; i < 10; i++) myStack.push(i);
    for (int i = 0; i < 20; i++) myStack2.push(i);


    System.out.print("Stack in myStack: ");
    for (int i = 0; i < myStack.tos; i++) System.out.print(myStack.pop() + ", ");

    System.out.println();

    System.out.print("Stack in myStack2: ");
    for (int i = 0; i < myStack2.tos; i++) System.out.print(myStack2.pop() + ", ");


  }
}
