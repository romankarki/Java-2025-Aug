package app;
import bst.BST;

public class Main {
    public static void main(String[] args) {
        var tree = new BST();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);
        tree.printTree(tree.root);
    }
}