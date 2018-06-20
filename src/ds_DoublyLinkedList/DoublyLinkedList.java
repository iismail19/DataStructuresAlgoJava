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

    // assume non-empty list
    public boolean insertAfter(T key, T data){ // the key is insert after this data, the Dada is the data to be inserted
        Node current = first; // we start from the beginning of the list
        while(current.data != key){ // as long as we have not found the key in a particular node
            current = current.next; // advance current
            if(current == null){ // not able to find the key you are searching for
                return false;
            }
        }

        Node<T> newNode = new Node<>();
        newNode.data = data;
        if(current == last){ // if the current node is the last node
            current.next = null;
            last = newNode;
        } else { // if this node is any other node
            newNode.next = current.next; // new node's first field should point to the node of the current's node next field
            current.next.previous = newNode; // the node ahead of the current node's previous points back to the node inserted after the current node
        }

        newNode.previous = current;
        current.next = newNode;
        return true;
    }

    //assume non-empty list
    public Node deleteKey(T key){
        Node current = first;

        while (current.data != key){
            current = current.next;
            if(current == null){
                return null; // no key found
            }
        }

        Node<T> temp = new Node();
        if(current == first){
            temp = first;
            first = current.next;
            current.next.previous = null;
        } else if (current == last){ // if it is the last node
            temp = last;
            current.previous.next = null;
            last = current.previous;
        } else{
            temp = current;
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        return temp;
    }
}
