package sorting;

import java.util.List;

public interface Sorting {

    List<Integer> sort(List<Integer> list);

    /**
     * Pass the list where the swapping needs to happen, first index and the second index.
     *
     * @param list
     * @param firstPosition
     * @param lastPosition
     */
    default void swap(List<Integer> list, int firstPosition, int lastPosition) {
        int temp = list.get(lastPosition);
        list.set(lastPosition, list.get(firstPosition));
        list.set(firstPosition, temp);
    }

}
