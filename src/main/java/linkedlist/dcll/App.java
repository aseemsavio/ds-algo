package linkedlist.dcll;

public class App {

    public static void main(String[] args) {

        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insertAtTheEnd(66);
        list.traverse();

        list.insertAfter(88, 66);
        list.traverse();

        list.delete(88);
        list.traverse();
    }

}
