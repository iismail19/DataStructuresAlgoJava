package ds_CircularLinkedList;

public class App {
    public static void main(String[] args){
        CircularLinkedList<Integer> cList = new CircularLinkedList<>();
        cList.insertFirst(10);
        cList.insertFirst(99);
        cList.insertLast(69);
        cList.displayList();

    }
}
