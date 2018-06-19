package ds_LinkedList;

public class LinkedListApp {
    public static void main(String[] args){
        Node<Integer> nodeA = new Node();
        nodeA.value = 10;

        Node<Integer> nodeB = new Node();
        nodeB.value = 7;

        Node<Integer> nodeC = new Node();
        nodeC.value = 4;

        Node<Integer> nodeD = new Node();
        nodeD.value = 8;

        // telling the object of the memory location of the next Object
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        //System.out.println(nodeA.next);

        System.out.println("The Length of the List: " + listLength(nodeA));

    }

    public static int listLength(Node oNode){
        int counter = 0;

        while (oNode != null){
            counter++;
            oNode = oNode.next;
        }
        return counter;
    }
}
