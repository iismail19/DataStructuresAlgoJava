package ds_DoublyLinkedList;

public class Node<T> {
    public T data;
    public Node next;
    public Node previous;

    public void displayNode(){
        System.out.println("{ " + data + " }");
    }

}
