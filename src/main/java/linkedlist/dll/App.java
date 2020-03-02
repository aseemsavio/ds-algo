package linkedlist.dll;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insert(1);
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(3);
        doublyLinkedList.insert(4);
        doublyLinkedList.insert(5);
        doublyLinkedList.insert(6);
        doublyLinkedList.insert(7);

        doublyLinkedList.insertAtEnd(10);
        doublyLinkedList.traverse();

        doublyLinkedList.insertAfter(22, 5);

        doublyLinkedList.traverse();
        doublyLinkedList.delete(7);
        doublyLinkedList.traverse();
    }

}
