package queue;
public class Queue {

    public class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    
   private Node first;
   private Node last; 
   private int length;

    public Queue(int value) {    
        Node newNode = new Node(value); 
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;      
        while (temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }   
    }

}