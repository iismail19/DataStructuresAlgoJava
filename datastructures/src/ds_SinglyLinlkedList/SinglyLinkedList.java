package ds_SinglyLinlkedList;

public class SinglyLinkedList<T> implements iSinglyLinkedList<T>{
    private Node<T> first; // Head
    private Node<T> last; //tail

    public boolean isEmpty(){
        return (first == null); // if true the list is Empty
    }

    // used to insert in the beginning of the list
    @Override
    public void insertFirst(T data){
        Node<T> newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode; // reassign newNode to be the first node in the list
        if(first.next == null)
            last = first;
    }



    @Override
    public void insertLast(T data){
        Node<T> newNode = new Node();
        newNode.data = data;
        if(last == null){
            last = newNode;
        }
        else if (last.next == null){
            last.next = newNode;
            last = newNode;
        }
        if(first == null){
            first = last;
        }
    }


    public Node deleteNode(){
        Node temp = first;
        first = first.next;
        return temp;
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
