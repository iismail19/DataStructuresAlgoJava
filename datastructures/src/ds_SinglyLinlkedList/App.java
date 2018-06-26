package ds_SinglyLinlkedList;

public class App {
    public static void main(String[] args){
        SinglyLinkedList<String> myList = new SinglyLinkedList();
//        myList.insertFirst("ADC: Binh");
//        myList.insertFirst("JUNGLE: Angel");
//        myList.insertLast("Support: Ismail");
//        myList.insertLast("LUFFFYYY");
//        myList.insertFirst("TIMMMM");
        myList.insertLast("Last");
        myList.insertFirst("First");
        myList.insertLast("Last 2");
        myList.displayList();
    }
}
