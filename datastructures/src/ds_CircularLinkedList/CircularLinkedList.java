package ds_CircularLinkedList;

public class CircularLinkedList<T> implements  iCircularLinkedList<T>{

    private Node<T> first;
    private Node<T> last;

    // first and the last are going to be pointing to nothing
    public CircularLinkedList(){
        first = null;
        last = null;
    }


    @Override
    public void insertFirst(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first; // newNode --> old first
        first = newNode; // newNode took place of the "first" object was pointing to... becomes first place
    }

    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public void insertLast(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        } else{
            last.next = newNode; // the next value of the last node will point to the new node
            last = newNode; // we make the new node we created be the last one in the list
        }
    }

    @Override
    public T deleteFirst() {
        T temp = first.data; // first capture the data in the first node

        if(first.next == null){ // means we only have a single node
            last = null;
        }

        first = first.next; // replace first with the next first node... first will point to old's next value

        return temp;
    }

    @Override
    public T displayFirst() {
        if(!isEmpty()){
            return first.data;
        }
        else {
            System.out.println("return null if there is not first element in linked list");
            return null;
        }
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



}
