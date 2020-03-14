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

    /**
     * Implementation of Insert Node
     *
     * @param node
     * @param dataToInsert
     * @return
     */
    private Node insert(Node node, int dataToInsert) {
        if (node == null)
            return new Node(dataToInsert);
        if (dataToInsert < node.getData())
            node.setLeft(insert(node.getLeft(), dataToInsert));
        else if (dataToInsert > node.getData())
            node.setRight(insert(node.getRight(), dataToInsert));
        else return node;

        // updating the height of the ancestor node
        node.setHeight(height(node));
        int balanceFactor = getBalanceFactor(node);

        // Left Left Case
        if (balanceFactor > 1 && dataToInsert < node.getLeft().getData())
            return rotateRight(node);

        // Right Right Case
        if (balanceFactor < -1 && dataToInsert > node.getRight().getData())
            return rotateLeft(node);

        // Left Right Case


        return node;
    }

    /**
     * Returns the new root
     *chrome
     *
     * @param node
     * @return
     */
    private Node rotateRight(Node node) {
        Node newRoot = node.getLeft();
        Node tempNode = newRoot.getRight();
        newRoot.setRight(node);
        node.setLeft(tempNode);
        updateHeight(newRoot);
        updateHeight(node);
        return newRoot;
    }

    /**
     * rotates left and returns the new oot.
     *
     * @param node
     * @return
     */
    private Node rotateLeft(Node node) {
        Node newRoot = node.getRight();
        Node tempNode = newRoot.getLeft();
        newRoot.setLeft(node);
        node.setRight(tempNode);
        updateHeight(node);
        updateHeight(newRoot);
        return newRoot;
    }

    /**
     * Gives the height of a given node
     *
     * @param node
     * @return
     */
    private int height(Node node) {
        if (node == null)
            return 0;
        return node.getHeight();
    }

    /**
     * Gives the greatest of two integers
     *
     * @param a
     * @param b
     * @return
     */
    private int max(int a, int b) {
        return a > b ? a : b;
    }

    /**
     * Updates the height of a given node
     *
     * @param node
     */
    private void updateHeight(Node node) {
        node.setHeight(max(height(node.getLeft()), height(node.getRight())) + 1);
    }

    /**
     * Gets the balance factor
     *
     * @param node
     * @return
     */
    private int getBalanceFactor(Node node) {
        return (node == null) ? 0 : height(node.getLeft()) - height(node.getRight());
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
