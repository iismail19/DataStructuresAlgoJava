package ds_DoublyLinkedList;

public class DoublyLinkedList<T> {

    private Node<T> first;
    private Node<T> last;

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){ //
        return (first == null);
    }

    public void insertFirst(T data){
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if(isEmpty()){ // if empty, last will refer to the new Node being created
            last = newNode;
        } else {
            first.previous = newNode;
        }

        newNode.next = first; // the new node's next field will point to the old first
        this.first = newNode; // reassign first to the new Node, so that new Node will be first
    }

    public void insertLast(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        } else {
            last.next = newNode; // assign old last to the newNode
            newNode.previous = last;
        }
        last = newNode; // reassign the old last to the newNode
    }

    public void displayList(){
        System.out.println("List (first --> last)");
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    // assume non-empty list
    public Node<T> deleteFirst(){
        Node<T> temp = new Node();
        temp = first;
        if(first.next == null){
            last = null;
        } else{
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    // assume non-empty list
    public Node<T> deleteLast(){
        Node<T> temp = new Node();
        temp = last;
        if(last.previous == null) {
            first = null;
        } else {
            last = last.previous;
        }
        last.next = null;
        return temp;

    }
}
