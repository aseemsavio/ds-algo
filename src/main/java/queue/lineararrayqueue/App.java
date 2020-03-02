package queue.lineararrayqueue;

public class App {

    public static void main(String[] args) {
        LinearArrayQueue queue = new LinearArrayQueue(5);
        System.out.println("Size of the Queue: " + queue.getBody().length);

        System.out.println("Is Empty: " + queue.isEmpty());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);

        queue.printQueue();
        System.out.println("Is Full: " + queue.isFull());


        queue.dequeue();
        queue.printQueue();
        System.out.println("Beginning: " + queue.getBeginning());

        queue.dequeue();
        queue.printQueue();
        System.out.println("Beginning: " + queue.getBeginning());

        System.out.println("Is Full: " + queue.isFull());

        queue.peek();

        System.out.println("Is Empty: " + queue.isEmpty());
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);

        System.out.println("Is Full: " + queue.isFull());



    }

}
