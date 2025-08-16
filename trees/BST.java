package bst;

public class BST {

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(value){
            this.value = value;
        }
    }

    public Node root;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }   
        Node current = root;
        while (true) {
            if (value < current.value) {        
                if (current.left == null) {
                    current.left = newNode;
                    return;
                }   
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                }       
                current = current.right;
            }
        }

    }



}