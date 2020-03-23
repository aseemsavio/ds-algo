package sorting;

import java.util.List;

/**
 * Have to revisit - error
 */
public class SelectionSort implements Sorting {

    @Override
    public List<Integer> sort(List<Integer> list) {
        System.out.println("Selection Sort: ");
        long then = System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (list.get(j) < list.get(min))
                    min = j;
            }
            swap(list, list.get(i), list.get(min));
        }
        System.out.println("Time Taken: " + (System.currentTimeMillis() - then) + " ms.");
        return list;
    }
}
