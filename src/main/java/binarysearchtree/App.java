package binarysearchtree;

import static binarysearchtree.BinarySearchTree.TraversalType.*;

public class App {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(3);
        tree.insert(15);
        tree.insert(100);

        tree.traverse(IN_ORDER);
        System.out.println();

        tree.traverse(POST_ORDER);
        System.out.println();

        tree.traverse(PRE_ORDER);
        System.out.println();

        tree.search(45);
        tree.search(3);
        //tree.search(34);
        tree.delete(3);
        tree.traverse(IN_ORDER);

        tree.delete(15);
        System.out.println();
        tree.traverse(IN_ORDER);
    }

}
