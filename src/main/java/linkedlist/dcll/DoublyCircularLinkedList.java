package linkedlist.dcll;

public class DoublyCircularLinkedList {

    private Node head;
    private Node tail;

    public DoublyCircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Inserts a new LinearArrayQueue with the given value to the Linked List
     *
     * @param dataToInsert
     */
    public void insert(int dataToInsert) {
        if (head == null) {
            Node newNode = new Node(dataToInsert);
            newNode.setPrevious(newNode);
            newNode.setNext(newNode);
            head = newNode;
            tail = newNode;
        } else {
            insertAtTheStart(dataToInsert);
        }
    }

    /**
     * Inserts a new LinearArrayQueue with the given value at the start of the Linked List
     *
     * @param dataToInsert
     */
    public void insertAtTheStart(int dataToInsert) {
        if (head != null) {
            Node newNode = new Node(dataToInsert);
            newNode.setNext(head);
            head.setPrevious(newNode);
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            head = newNode;
        }
    }

    /**
     * Inserts a new node at the end of the linked list with the data given
     *
     * @param dataToInsert
     */
    public void insertAtTheEnd(int dataToInsert) {
        if (tail != null) {
            Node newNode = new Node(dataToInsert);
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            newNode.setNext(head);
            head.setPrevious(newNode);
            tail = newNode;
        }
    }

    /**
     * Inserts a new node after the node with the given data
     *
     * @param dataToInsert
     * @param afterWhom
     */
    public void insertAfter(int dataToInsert, int afterWhom) {
        if (head != null) {
            Node node = head;
            do {
                if (afterWhom == node.getData()) {
                    Node newNode = new Node(dataToInsert);
                    newNode.setPrevious(node);
                    newNode.setNext(node.getNext());
                    node.getNext().setPrevious(newNode);
                    node.setNext(newNode);
                    if (tail.getData() == afterWhom) // special case
                        tail = newNode;
                }
                node = node.getNext();
            } while (node.getNext() != head.getNext());
        }
    }

    public void delete(int dataToDelete) {
        if (head == null)
            return;

        Node node = head;
        do {
            if (node.getData() == dataToDelete) {
                node.getPrevious().setNext(node.getNext());
                node.getNext().setPrevious(node.getPrevious());

                if (tail.getData() == dataToDelete)
                    tail = tail.getPrevious();

                else if (head.getData() == dataToDelete)
                    head = head.getNext();

            }
            node = node.getNext();
        } while (node.getNext() != head.getNext());
    }


    /**
     * Traverses the linked list
     */
    public void traverse() {
        System.out.println();
        if (head == null)
            return;

        Node node = head;
        do {
            System.out.print(node.getData() + " -> ");
            node = node.getNext();
        } while (node.getNext() != head.getNext());
    }


}
