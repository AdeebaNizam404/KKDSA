public class QueueMain {
    public static void main(String[] args) throws Exception {
        // CustomQueue queue =new CustomQueue();
        // queue.insert(90);
        // queue.insert(80);
        // queue.insert(60);
        // queue.insert(12);
        // queue.insert(77);
        // queue.insert(34);
        // queue.display();
        // System.out.println(queue.remove());
        // queue.display();
        CircularQueue queue = new CircularQueue(5);
        queue.insert(90);
        queue.insert(80);
        queue.insert(60);
        queue.insert(12);
        queue.insert(77);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(1333);
        queue.display();
    }
}
