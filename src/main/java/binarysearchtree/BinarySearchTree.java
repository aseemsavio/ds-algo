package binarysearchtree;

/**
 * deletion not working properly
 */
public class BinarySearchTree {

    private Node root;


    /**
     * Publicly accessible insert method
     *
     * @param dataToInsert
     */
    public void insert(int dataToInsert) {
        root = insert(root, dataToInsert);
    }

    /**
     * Inserts new nodes with data into the Binary Search Tree.
     *
     * @param node
     * @param dataToInsert
     * @return
     */
    private Node insert(Node node, int dataToInsert) {
        if (node == null) {
            root = new Node(dataToInsert);
            return root;
        }
        if (dataToInsert < node.getData())
            node.setLeft(insert(node.getLeft(), dataToInsert));

        else if (dataToInsert > node.getData())
            node.setRight(insert(node.getRight(), dataToInsert));

        return node;
    }

    /**
     * Various kinds of traversals
     *
     * @param traversal
     */
    public void traverse(TraversalType traversal) {
        switch (traversal) {
            case IN_ORDER:
                inOrderTraversal(root);
                break;
            case POST_ORDER:
                postOrderTraversal(root);
                break;
            case PRE_ORDER:
                preOrderTraversal(root);
                break;
        }
    }

    /**
     * LEFT -> ROOT -> RIGHT
     *
     * @param node
     */
    private void inOrderTraversal(Node node) {
        if (node == null)
            return;
        inOrderTraversal(node.getLeft());
        System.out.print(node.getData() + " -> ");
        inOrderTraversal(node.getRight());
    }

    /**
     * ROOT -> LEFT -> RIGHT
     *
     * @param node
     */
    private void preOrderTraversal(Node node) {
        if (node == null)
            return;
        System.out.print(node.getData() + " -> ");
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }

    /**
     * LEFT -> RIGHT -> ROOT
     *
     * @param node
     */
    private void postOrderTraversal(Node node) {
        if (node == null)
            return;
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
        System.out.print(node.getData() + " -> ");
    }

    /**
     * Searches a given value in the nodes of the Binary Search Tree
     *
     * @param dataToSearch
     */
    public void search(int dataToSearch) {
        Node node = search(this.root, dataToSearch);
        if (node != null)
            System.out.println(node.getData() + " found");
        else
            System.out.println("Couldn't find " + dataToSearch);
    }

    /**
     * Actual Search Tree implementation
     *
     * @param node
     * @param dataToSearch
     * @return
     */
    private Node search(Node node, int dataToSearch) {
        if (node == null)
            return node;

        else if (node.getData() == dataToSearch)
            return node;

        else if (dataToSearch < node.getData())
            node = search(node.getLeft(), dataToSearch);

        else if (dataToSearch > node.getData())
            node = search(node.getRight(), dataToSearch);

        return node;
    }

    /**
     * Deletes nodes from a Binary Search Tree
     *
     * @param dataToDelete
     */
    public void delete(int dataToDelete) {
        if (root != null)
            root = delete(this.root, dataToDelete);
    }

    /**
     * Impleentation of deletion operation in BST
     *
     * @param node
     * @param dataToDelete
     * @return
     */
    private Node delete(Node node, int dataToDelete) {
        if (node == null)
            return node;

        else if (dataToDelete < node.getData())
            node.setLeft(delete(node.getLeft(), dataToDelete));

        else if (dataToDelete > node.getData())
            node.setRight(delete(node.getRight(), dataToDelete));

        else {
            if (node.getLeft() == null && node.getRight() == null) {
                // has no children
                return null;
            } else if (node.getLeft() == null) {
                // has right child
                return node.getRight();
            } else if (node.getRight() == null) {
                // has left child
                return node.getLeft();
            } else {
                // has both children

                // get predecessor
                Node predecessor = getPredecessor(node.getLeft());
                int predecessorData = predecessor.getData();

                // delete the predecessor
                node.setLeft(delete(node.getLeft(), predecessorData));
            }
        }
        return node;
    }

    /**
     * Predecesor is the largest element in the left subtree.
     *
     * @param node
     * @return
     */
    private Node getPredecessor(Node node) {

        if (node.getRight() != null)
            return getPredecessor(node.getRight());

        return node;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public enum TraversalType {
        PRE_ORDER,
        POST_ORDER,
        IN_ORDER
    }
}
