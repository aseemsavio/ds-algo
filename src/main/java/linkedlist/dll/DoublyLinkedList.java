package linkedlist.dll;

/**
 * @author Aseem Savio
 */
public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Insert new Nodes to the Linked List
     *
     * @param dataToInsert
     */
    public void insert(int dataToInsert) {
        if (head == null) {
            Node newNode = new Node(dataToInsert);
            newNode.setPrevious(null);
            newNode.setNext(null);
            head = newNode;
            tail = newNode;
        } else
            insertAtBeginning(dataToInsert);
    }

    /**
     * Insert new nodes to the start of the linked list
     *
     * @param dataToInsert
     */
    public void insertAtBeginning(int dataToInsert) {
        if (head != null) {
            Node tempNode = head;
            Node newNode = new Node(dataToInsert);
            newNode.setPrevious(null);
            newNode.setNext(tempNode);
            tempNode.setPrevious(newNode);
            head = newNode;
        }
    }

    /**
     * Inserts a new LinearArrayQueue at the end of the linked list
     *
     * @param dataToInsert
     */
    public void insertAtEnd(int dataToInsert) {
        if (tail != null) {
            Node tempNode = tail;
            Node newNode = new Node(dataToInsert);
            tempNode.setNext(newNode);
            newNode.setPrevious(tempNode);
            newNode.setNext(null);
            tail = newNode;
        }
    }

    /**
     * Inserts a new LinearArrayQueue after the first node with the given data (afterWhom)
     *
     * @param dataToInsert
     * @param afterWhom
     */
    public void insertAfter(int dataToInsert, int afterWhom) {
        if (head == null)
            return;
        Node tempNode = head;

        do {
            if (tempNode.getData() == afterWhom) {
                Node newNode = new Node(dataToInsert);
                newNode.setPrevious(tempNode);
                newNode.setNext(tempNode.getNext());
                tempNode.getNext().setPrevious(newNode);
                tempNode.setNext(newNode);
            }
            tempNode = tempNode.getNext();
        } while (tempNode != null);
    }

    /**
     * Deletes the first node with the given data.
     *
     * @param dataToDelete
     */
    public void delete(int dataToDelete) {
        if (head == null)
            return;
        Node tempNode = head;
        do {
            if (tempNode.getData() == dataToDelete) {
                Node tempNextNode = tempNode.getNext();
                Node tempPrevNode = tempNode.getPrevious();
                if (tempNextNode != null && tempPrevNode != null) {
                    tempPrevNode.setNext(tempNextNode);
                    tempNextNode.setPrevious(tempPrevNode);
                    return;
                } else if (tempNextNode == null) {
                    tempNode.getPrevious().setNext(null);
                    tail = tempNode.getPrevious();
                    return;
                } else if (tempPrevNode == null) {
                    tempNode.getNext().setPrevious(null);
                    head = tempNode.getNext();
                    return;
                }
            }
            tempNode = tempNode.getNext();
        } while (tempNode != null);

    }

    /**
     * Traverses the Linked List
     */
    public void traverse() {
        System.out.println();
        Node node = head;
        if (node != null) {
            System.out.print(node.getData() + " -> ");
            do {
                System.out.print(node.getNext().getData() + " -> ");
                node = node.getNext();
            } while (node.getNext() != null);
        } else return;
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
