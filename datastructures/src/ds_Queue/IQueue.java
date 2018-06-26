package ds_Queue;

public interface IQueue<T> {
    void insert(T j);
    void printQueue();
    T remove();
    T peek();
    boolean isEmpty();
    boolean isFull();
}
