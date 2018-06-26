package ds_stack;

public class Stack {
    private int maxSize;
    private long[] stackarray;
    private int top;

    // Constructor
    public Stack(int size){
        this.maxSize = size;
        this.stackarray = new long[maxSize];
        this.top = -1; // no items you want to point to the top and -1 is empty
    }

    public void push(long item){
        if(!isFull()){
            top++;
            stackarray[top] = item;
        }
        else{
            System.out.println("Your Stack is at capacity...[maxsize] = " + maxSize +
            "Cannot add element: " + item);
        }

    }

    public long pop(){
        if(isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;
        }
        else{
            long val = stackarray[top];
            top--;
            return val;
        }
    }

    public long peek(){
        return stackarray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize-1 == top);
    }

    public static void printStack(Stack theStack){
        while (!theStack.isEmpty()){
            System.out.println(theStack.pop());
        }
    }

}
