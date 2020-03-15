package binaryheap;

public class BinaryHeap {

    private final int FRONT = 1;
    private int heapSize;
    private int maxSize;
    private final int ONE = 1;
    private final int TWO = 2;
    private int[] heap;

    private final String HEAD = " HEAD: ";
    private final String LEFT = " LEFT: ";
    private final String RIGHT = " RIGHT: ";

    public BinaryHeap(int maxSize) {
        this.maxSize = maxSize;
        heap = new int[maxSize];
        heap[0] = Integer.MIN_VALUE;
    }

    /**
     * Inserts data into the Binary Heap
     *
     * @param dataToInsert
     */
    public void insert(int dataToInsert) {
        if (heapSize == maxSize) {
            System.out.println("ERROR: Heap is full. Could not insert " + dataToInsert);
            return;
        }
        heap[++heapSize] = dataToInsert;
        int current = heapSize;
        while (heap[current] < heap[getParent(current)]) {
            swap(current, getParent(current));
            current = getParent(current);
        }
    }

    /**
     * Prints the Binary Heap
     */
    public void print() {
        for (int i = 1; i < heapSize / 2; i++) {
            StringBuilder sb = new StringBuilder();
            System.out.println(sb.append(HEAD).append(heap[i]).append(LEFT)
                    .append(heap[TWO * i]).append(RIGHT).append(heap[(TWO * i) + ONE]));
        }
        System.out.println();
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("ERROR: Binary Heap is empty. Could not delete");
            return;
        }
        heap[FRONT] = heap[heapSize--];
        minHeapify(FRONT);
    }

    /**
     * parent = position / 2
     *
     * @param position
     * @return
     */
    private int getParent(int position) {
        return position / TWO;
    }

    /**
     * leftChild = position * 2
     *
     * @param position
     * @return
     */
    private int getLeftChild(int position) {
        return position * TWO;
    }

    /**
     * rightChild = (position * 2) + 1
     *
     * @param position
     * @return
     */
    private int getRightChild(int position) {
        return (position * TWO) + ONE;
    }

    /**
     * Swaps the values in two given positions
     *
     * @param firstPosition
     * @param secondPosition
     */
    private void swap(int firstPosition, int secondPosition) {
        int temp = heap[firstPosition];
        heap[firstPosition] = heap[secondPosition];
        heap[secondPosition] = temp;
    }

    private boolean isLeaf(int position) {
        return (position >= heapSize / 2 && position <= heapSize);
    }

    /**
     * Checks if the Binary heap is empty
     *
     * @return
     */
    private boolean isEmpty() {
        return heapSize == 1;
    }

    /**
     * Checks if the binary heap is full
     *
     * @return
     */
    private boolean isFull() {
        return heapSize == maxSize;
    }

    /**
     * Ensures the Minheap properties are maintained
     *
     * @param position
     */
    private void minHeapify(int position) {
        if (!isLeaf(position) && isParentGreaterThanChild(position)) {
            if (heap[getLeftChild(position)] < heap[getRightChild(position)]) {
                swap(position, getLeftChild(position));
                minHeapify(getLeftChild(position));
            } else {
                swap(position, getRightChild(position));
                minHeapify(getRightChild(position));
            }
        }
    }

    /**
     * Checks if the parent is greater than the child
     *
     * @param position
     * @return
     */
    private boolean isParentGreaterThanChild(int position) {
        return heap[position] > heap[getLeftChild(position)] || heap[position] > heap[getRightChild(position)];
    }
}
