package ds_DoublyLinkedList;

public class AppDoubly {
    public static void main(String[] args){
        DoublyLinkedList<Integer> dList = new DoublyLinkedList<>();
        dList.insertFirst(2);
        dList.insertFirst(3);
        dList.insertLast(15);
        dList.insertLast(16);
        dList.deleteKey(3).displayNode();
        dList.deleteKey(2).displayNode();
        dList.displayList();

    }
}
