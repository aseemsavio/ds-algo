package avltree;

/**
 * Tree balances itself during insertion
 */
public class AvlTree {

    private Node root;

    public AvlTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
