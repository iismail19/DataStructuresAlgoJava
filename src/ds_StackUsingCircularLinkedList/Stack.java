package ds_StackUsingCircularLinkedList;
import ds_CircularLinkedList.*;


public class Stack<T> {
    private CircularLinkedList<T> stackList;

    // Constructor()
    public Stack(){
        this.stackList = new CircularLinkedList<>();
    }

    public void push(T item){
        stackList.insertFirst(item);
    }

    public T pop(){
        if (stackList.isEmpty()){
            System.out.println("The Stack is empty");
            return null;
        }
        else {
            return stackList.deleteFirst();
        }
    }

    public T peek(){
        return stackList.displayFirst();
    }

    public void printStack(){
        stackList.displayList();
    }
}
