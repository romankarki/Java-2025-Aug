package app;
import selections.Selection;
import linkedlist.LinkedList;

public class app {
    public static void main (String[] args){
        
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.printList();
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.removeLast();
        linkedList.printList();

    }
}