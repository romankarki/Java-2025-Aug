package app;
import queue.Queue;
public class Main{

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        q.printQueue();
    }
}