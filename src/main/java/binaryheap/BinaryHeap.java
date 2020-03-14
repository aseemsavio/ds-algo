package binaryheap;

public abstract class BinaryHeap implements Heap {

    protected int[] heap;
    protected int heapSize;
    protected int maxSizeOfHeap;
    protected final int first = 1;

    public BinaryHeap(int maxSizeOfHeap) {
        this.maxSizeOfHeap = maxSizeOfHeap;
        heap = new int[maxSizeOfHeap + 1];
    }

    @Override
    public void insert(int dataToInsert) {}

    @Override
    public void remove(int dataToRemove) {}

    @Override
    public void peek(int dataToPeek) {}

    @Override
    public void extract(int dataToExtract) {}

    /**
     * parent = position / 2
     *
     * @param position
     * @return
     */
    protected int getParent(int position) {
        return heap[position / 2];
    }

    protected int getparentPosition(int position) {
        return position / 2;
    }

    /**
     * Left Child = position * 2
     *
     * @param position
     * @return
     */
    protected int getLeftChild(int position) {
        return heap[position * 2];
    }

    protected int getLeftChildPosition(int position) {
        return position * 2;
    }

    /**
     * Right Child = position * 2 + 1
     *
     * @param position
     * @return
     */
    protected int getRightChild(int position) {
        return heap[position * 2 + 1];
    }

    protected int getRightChildPosition(int position) {
        return position * 2 + 1;
    }

    /**
     * Finds if a given node is a leaf or not
     *
     * @param position
     * @return
     */
    protected boolean isLeaf(int position) {
        return (position >= (heapSize / 2) && position <= heapSize);
    }

    /**
     * Swaps two nodes
     *
     * @param initialPosition
     * @param newPosition
     */
    protected void swap(int initialPosition, int newPosition) {
        int temp = heap[initialPosition];
        heap[initialPosition] = heap[newPosition];
        heap[newPosition] = temp;
    }
}
