package linkedlist.scll;

public class SingleCircularLinkedList {

    Node head = null;
    Node tail = null;

    /**
     * Inserts at the beginning
     *
     * @param data
     */
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.setNext(head);
            return;
        } else
            insertAtFirst(data);
    }

    /**
     * Inserts at first of the linked list
     *
     * @param data
     */
    public void insertAtFirst(int data) {

        Node newNode = new Node(data);
        if (head != null) {
            newNode.setNext(head);
            head = newNode;
            tail.setNext(head);
            return;
        } else
            insert(data);
    }

    /**
     * Inserts at the end of the linked list
     *
     * @param data
     */
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
            return;
        } else
            insert(data);
    }

    /**
     * Traverses and prints the contents of the linked list
     */
    public void traverse() {
        Node node = head;
        if (node == null) {
            System.out.println("The linked list is empty");
            return;
        }
        do {
            System.out.print(node.getData() + " -> ");
            node = node.getNext();
        } while (node.getNext() != head.getNext());
        System.out.println();
    }

    /**
     * Searches a value in the linked list
     *
     * @param dataToSearch
     * @return
     */
    public boolean isFound(int dataToSearch) {
        Node node = head;
        if (head == null)
            return false;
        do {
            if (node.getData() == dataToSearch)
                return true;
            node = node.getNext();
        } while (node.getNext() != head.getNext());
        return false;
    }

    /**
     * Deletes the data given
     *
     * @param dataToDelete
     */
    public void delete(int dataToDelete) {
        if (head == null)
            return;
        if (head.getData() == dataToDelete) {
            System.out.println("Head: " + head.getData());
            Node tempNode = head.getNext();
            head = tempNode;
            tail.setNext(head);
            return;
        } else if (tail.getData() == dataToDelete) {
            Node node = head;
            Node previousNode = null;
            do {
                previousNode = node;
                node = node.getNext();
            } while (node.getNext() != head);
            tail = previousNode;
            tail.setNext(head);
            return;
        } else {
            Node node = head;
            Node previousNode = null;
            do {
                previousNode = node;
                node = node.getNext();
                if (node.getData() == dataToDelete)
                    previousNode.setNext(node.getNext());
            } while (node.getNext() != head.getNext());
        }
    }

    /**
     * Deletes the entire Linked List
     */
    public void deleteList() {
        head = null;
        tail.setNext(null);
        tail = null;
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
