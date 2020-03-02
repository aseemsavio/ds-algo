package linkedlist.sll;

public class SingleLikedList {

    private Node head = null;
    private Node tail = null;

    /**
     * Usual Insertion
     *
     * @param data
     */
    public void insert(int data) {

        Node newNode = new Node(data);
        if (head == null)
            tail = newNode;
        newNode.setNext(head);
        head = newNode;

    }

    /**
     * Insert specifically in the end
     *
     * @param data
     */
    public void insertLast(int data) {
        if (head != null) {
            Node newNode = new Node(data);
            newNode.setNext(null);
            tail.setNext(newNode);
            tail = newNode;
        } else {
            throw new RuntimeException("Linked List is empty. Cannot insert at the end.");
        }
    }

    /**
     * Inserts after a specific entry
     *
     * @param dataToInsert
     * @param dataAfter
     */
    public void insertAfter(int dataToInsert, int dataAfter) {
        Node newNode = new Node(dataToInsert);
        Node node = head;
        Node tempNode = null;
        if (head != null) {
            while (node != null && node.getNext() != null) {
                if (node.getData() == dataAfter) {
                    tempNode = node.getNext();
                    node.setNext(newNode);
                    newNode.setNext(tempNode);
                }
                node = node.getNext();
            }

        } else
            throw new RuntimeException("Linked List is empty. Cannot insert at the end.");

    }

    /**
     * Traverse through the single Linked List
     *
     * @param node
     */
    public void traverse(Node node) {
        System.out.println();
        if (node == null)
            return;
        else {
            System.out.print(node.getData() + " -> ");
            do {
                System.out.print(node.getNext().getData() + " -> ");
                node = node.getNext();
            } while (node.getNext() != null);
        }
    }

    /**
     * Deletes a node from the Linked List
     *
     * @param dataToDelete
     */
    public void delete(int dataToDelete) {
        Node tempNode = head;
        Node previousNode = null;
        if (head == null)
            return;
        if (head.getData() == dataToDelete) {
            tempNode = head.getNext();
            head = tempNode;
            return;
        }
        while (tempNode != null && tempNode.getData() != dataToDelete && tempNode.getNext() != null) {
            previousNode = tempNode;
            tempNode = tempNode.getNext();
        }

        previousNode.setNext(tempNode.getNext());

    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

}
