package ds_Queue;

public class Queue<T> implements IQueue<T>{

    private int maxSize; // initializes the set number of slots
    private T[] queArray; // slots to maintain the data
    private int front; // this will be the index position for the element in the front of the line
    private int rear; // going to be the index position for the element at the back of the queue
    private int nItems; // counter to maintain the number of elements in queue

    public Queue(int size){
        this.maxSize = size;
        this.queArray = (T[]) new Object[size];
        front = 0; // index position of the first slot of the array
        rear = -1; // there is no item in the array yet to be considered as the last item
        nItems = 0; // no elements in the array
    }

    public void insert(T j){
        if(rear == maxSize -1){
            rear = -1; // go back to the start of the line: Circular Queue
        }
        else {
            rear++;
            queArray[rear] = j;
            nItems++;
        }
    }

    public void printQueue(){
        System.out.print("[ ");
        for(int i =0; i <nItems; i++){
            System.out.print(queArray[i]+ " ");
        }
        System.out.println("]");
    }

    public T remove(){ //remove item from the front of the Queue
        if (isEmpty()){
            System.out.println("The Queue is Empty");
            return null;
        }
        else{
            T temp = queArray[front];
            front++;
            if(front == maxSize){
                front = 0; // we can set the front back to the 0 index so we can utilize the entire array
            }
            nItems--;
            return temp;
        }
    }

    public T peek(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }
}
