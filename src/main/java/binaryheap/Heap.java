package binaryheap;

public interface Heap {

    void insert(int dataToInsert);

    void remove(int dataToRemove);

    void peek(int dataToPeek);

    void extract(int dataToExtract);
}
