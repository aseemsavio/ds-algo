package binaryheap;

public class BinaryMaxHeap extends BinaryHeap {

    public BinaryMaxHeap(int maxSizeOfHeap) {
        super(maxSizeOfHeap);
    }

    /**
     * Maintains the Max Heap properties
     *
     * @param position
     */
    protected void maxHeapify(int position) {
        if (!isLeaf(position) && isParentLesserThanChildren(position)) {
            if (heap[position] < getLeftChild(position)) {
                swap(position, getLeftChild(position));
                maxHeapify(getLeftChildPosition(position));
            } else if (heap[position] < getRightChild(position)) {
                swap(position, getRightChild(position));
                maxHeapify(getRightChildPosition(position));
            }
        }
    }

    protected boolean isParentLesserThanChildren(int position) {
        return heap[position] < getLeftChild(position) && heap[position] < getRightChild(position);
    }

}
