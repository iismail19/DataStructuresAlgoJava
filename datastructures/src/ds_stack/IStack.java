package ds_stack;

public interface IStack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    boolean isFull();

}
