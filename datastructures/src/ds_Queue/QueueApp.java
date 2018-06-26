package ds_Queue;

public class QueueApp {
    public static void main(String[] args){
        Queue<Integer> queue = new Queue(10);
        queue.insert(5);
        queue.insert(10);
        queue.insert(14);
        queue.insert(99);
        queue.insert(69);
        queue.printQueue();
    }
}
