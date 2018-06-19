package ds_SinglyLinlkedList;

// Underlying container for the Linked List class

public class Node<T> {
    T data;
    Node next;

    public void displayNode(){
        System.out.println("{ " + data + " }");
    }
}
