package binaryheap;

public class BinaryMinHeap extends BinaryHeap {

    public BinaryMinHeap(int maxSizeOfHeap) {
        super(maxSizeOfHeap);
    }

    @Override
    public void insert(int dataToInsert) {
        if (heapSize >= maxSizeOfHeap) {
            System.out.println("ERROR: Max Size of Heap reached. Could not insert " + dataToInsert);
            return;
        }
        heap[++heapSize] = dataToInsert;
        int current = heapSize;
        while (heap[current] < getParent(current)) {
            swap(current, getParent(current));
            current = getParent(current);
        }
    }

    @Override
    public void remove(int dataToRemove) {

    }

    @Override
    public void peek(int dataToPeek) {

    }

    @Override
    public void extract(int dataToExtract) {

    }

    /**
     * Maintains the Min Heap property
     *
     * @param position
     */
    protected void minHeapify(int position) {
        if (!isLeaf(position) && isParentsGreaterThanChildren(position)) {
            if (heap[position] > getLeftChild(position)) {
                swap(position, getLeftChildPosition(position));
                minHeapify(getLeftChildPosition(position));
            } else if (heap[position] > getRightChild(position)) {
                swap(position, getRightChildPosition(position));
                minHeapify(getRightChildPosition(position));
            }
        }
    }

    protected boolean isParentsGreaterThanChildren(int position) {
        return heap[position] > getLeftChild(position) || heap[position] > getRightChild(position);
    }
}
