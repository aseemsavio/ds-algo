package linkedlist.sll;

public class App {

    public static void main(String[] args) {
        SingleLikedList singleLikedList = new SingleLikedList();
        singleLikedList.insert(1);
        singleLikedList.insert(2);
        singleLikedList.insert(3);
        singleLikedList.insert(4);
        singleLikedList.insert(5);
        singleLikedList.insert(6);
        singleLikedList.insert(7);
        singleLikedList.insertLast(8);
        singleLikedList.insertLast(8);
        singleLikedList.insertLast(8);
        singleLikedList.insertLast(8);
        singleLikedList.insertLast(9);
        singleLikedList.traverse(singleLikedList.getHead());

        singleLikedList.insertAfter(11, 6);
        singleLikedList.traverse(singleLikedList.getHead());


        singleLikedList.delete(8);
        singleLikedList.traverse(singleLikedList.getHead());


    }

}
