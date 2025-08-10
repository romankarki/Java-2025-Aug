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
        linkedList.prepend(5);
        linkedList.printList();
        linkedList.get(2);
        linkedList.set(2, 99);
        linkedList.insert(2, 45);
        System.out.println("After Insertion");
        linkedList.printList();
        linkedList.remove(3);
        System.out.println("After Deletion");
        linkedList.printList();
        linkedList.reverse();
        System.out.println("After Reversing");
        linkedList.printList();
    }
}