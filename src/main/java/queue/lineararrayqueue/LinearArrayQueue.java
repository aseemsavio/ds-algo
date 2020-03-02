package queue.lineararrayqueue;

/**
 * Not proper. Use Circular Array Linked List
 */
public class LinearArrayQueue {

    private int size;

    // last element in the queue
    private int top;

    // first element in the queue
    private int beginning;
    private int[] body;

    public LinearArrayQueue(int size) {
        this.size = size;
        this.body = new int[size];
        this.top = -1;
        this.beginning = 0;
    }

    /**
     * Enqueues a value into a queue
     *
     * @param value
     */
    public void enqueue(int value) {
        if (size == top + 1) {
            System.out.println("Queue is full. Couldn't enqueue " + value);
            return;
        }
        body[++top] = value;
    }

    /**
     * Deletes the First element in the queue. (FIFO)
     */
    public void dequeue() {
        while (body[beginning] == 0) {
            ++beginning;
        }
        body[beginning] = 0;
        ++beginning;
    }

    /**
     * Displays the first element in the queue.
     */
    public void peek() {
        System.out.println();
        int tempBeginning = beginning;
        while (body[tempBeginning] == 0) {
            ++tempBeginning;
        }
        System.out.println("Peeking: " + body[tempBeginning]);
    }

    /**
     * Prints the queue
     */
    public void printQueue() {
        System.out.println();
        for (int content : body) {
            if (content != 0)
                System.out.print(content + " -> ");
        }
    }

    /**
     * Checks if the queue is empty o not.
     *
     * @return
     */
    public boolean isEmpty() {
        System.out.println();
        if (beginning == 0 && top == -1 || (beginning == size))
            return true;

        return false;
    }

    /**
     * Checks if the queue is full or not.
     *
     * @return
     */
    public boolean isFull() {
        System.out.println();
        if (top == size - 1 && beginning == 0)
            return true;
        return false;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBeginning() {
        return beginning;
    }

    public void setBeginning(int beginning) {
        this.beginning = beginning;
    }

    public int[] getBody() {
        return body;
    }

    public void setBody(int[] body) {
        this.body = body;
    }
}
