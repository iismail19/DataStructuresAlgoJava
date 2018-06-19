package ds_stack;

public class GenericStack<T> implements IStack<T>{
    private int maxSize;
    private T[] stackarray;
    private int top;

    public GenericStack(int size){
        this.maxSize = size;
        this.stackarray = (T[]) new Object[maxSize];
        this.top = -1; // no items you want to point to the top and -1 is empty

    }

    @Override
    public void push(T item) {
        if(!isFull()){
            top++;
            stackarray[top] = item;
        }
        else{
            System.out.println("Your Stack is at capacity...[maxsize] = " + maxSize +
                    "Cannot add element: " + item);
        }
    }

    @Override
    public T pop() {
        if(isEmpty()){
            System.out.println("The Stack is Empty");
            return null;
        }
        else{
            T val = stackarray[top];
            top--;
            return val;
        }
    }

    @Override
    public T peek() {
        return stackarray[top];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (maxSize-1 == top);
    }

    public static void printStack(GenericStack theStack) {
        while (!theStack.isEmpty()){
            System.out.println(theStack.pop());
        }
    }
}
