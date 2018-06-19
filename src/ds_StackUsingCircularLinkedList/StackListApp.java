package ds_StackUsingCircularLinkedList;

public class StackListApp {
    public static void main(String[] args){
        Stack<Integer> myStack = new Stack<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("peek: " + myStack.peek());
        myStack.pop();
        myStack.printStack();

    }
}
