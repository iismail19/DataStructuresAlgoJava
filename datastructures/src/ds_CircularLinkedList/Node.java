package ds_CircularLinkedList;

public class Node<T> {
    T data;
    Node next;

    public void displayNode(){
        System.out.println("{ " + data + " }");
    }
}