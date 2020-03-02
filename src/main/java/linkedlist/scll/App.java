package linkedlist.scll;

public class App {

    public static void main(String[] args) {
        SingleCircularLinkedList singleCircularLinkedList = new SingleCircularLinkedList();
        singleCircularLinkedList.insert(1);
        singleCircularLinkedList.insert(2);
        singleCircularLinkedList.insert(3);
        singleCircularLinkedList.insert(4);
        singleCircularLinkedList.insert(5);
        singleCircularLinkedList.insert(6);
        singleCircularLinkedList.insert(7);
        singleCircularLinkedList.insert(8);
        singleCircularLinkedList.traverse();

        singleCircularLinkedList.insertAtFirst(11);
        singleCircularLinkedList.insertAtEnd(22);

        System.out.println("isFound 1: " + singleCircularLinkedList.isFound(1));
        System.out.println("isFound 11: " + singleCircularLinkedList.isFound(11));
        System.out.println("isFound 16: " + singleCircularLinkedList.isFound(16));
        System.out.println("isFound 22: " + singleCircularLinkedList.isFound(11));

        singleCircularLinkedList.traverse();

        singleCircularLinkedList.delete(22);

        singleCircularLinkedList.traverse();

        singleCircularLinkedList.deleteList();
        singleCircularLinkedList.traverse();

    }

}
