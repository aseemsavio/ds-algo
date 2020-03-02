package leetcode;

/**
 * https://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/
 */
public class MiddleNodeOfLinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.traverse();
        System.out.println();
        System.out.println("Middle Node: " + list.findMiddleNode().data);

    }

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static class LinkedList {
        Node head;
        Node tail;

        public LinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insert(int dataToInsert) {
            if (head == null) {
                Node newNode = new Node(dataToInsert);
                head = newNode;
                tail = newNode;
                return;
            }

            Node newNode = new Node(dataToInsert);
            newNode.next = head;
            head = newNode;
        }

        public Node findMiddleNode() {
            Node slowPointer = head;
            Node fastPointer = head;

            do {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            } while(null != fastPointer.next.next);

            return slowPointer;
        }

        public void traverse() {
            if (head == null)
                return;
            Node node = head;
            do {
                System.out.print(node.data + " -> ");
                node = node.next;
            } while (node != tail.next);
        }
    }





}
