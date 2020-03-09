package avltree;

/**
 * Tree balances itself during insertion
 */
public class AvlTree {

    private Node root;

    public AvlTree() {
        this.root = null;
    }

    /**
     * Checks if the tree is null or not
     *
     * @return
     */
    public boolean isNull() {
        return (this.root == null);
    }

    /**
     * Inserts a new node with the given data
     *
     * @param dataToInsert
     */
    public void insert(int dataToInsert) {
        root = insert(root, dataToInsert);
    }

    private Node insert(Node node, int dataToInsert) {
        if (node == null)
            return new Node(dataToInsert);
        if (dataToInsert < node.getData())
            node.setLeft(insert(node.getLeft(), dataToInsert));
        else if (dataToInsert > node.getData())
            node.setRight(insert(node.getRight(), dataToInsert));
        return node;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
