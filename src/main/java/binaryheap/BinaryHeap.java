package binaryheap;

public class BinaryHeap {

    private final int FRONT = 1;
    private int heapSize;
    private int maxSize;
    private final int TWO = 2;
    private int[] heap;

    public BinaryHeap(int maxSize) {
        this.maxSize = maxSize;
        heap = new int[maxSize];
        heap[0] = Integer.MIN_VALUE;
    }


}
