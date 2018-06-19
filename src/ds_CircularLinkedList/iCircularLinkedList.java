package ds_CircularLinkedList;

public interface iCircularLinkedList<T> {

    void insertFirst(T data);
    void insertLast(T data);

    T deleteFirst();
    T displayFirst();
}
