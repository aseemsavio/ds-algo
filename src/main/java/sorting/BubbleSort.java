package sorting;

import java.util.List;

public class BubbleSort implements Sorting {

    @Override
    public List<Integer> sort(List<Integer> list) {
        System.out.println("Bubble Sort: ");
        long then = System.currentTimeMillis();
        int length = list.size();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (list.get(j) > list.get(j + 1))
                    swap(list, j, j + 1);
            }
        }
        System.out.println("Time Taken: " + (System.currentTimeMillis() - then) + " ms.");
        return list;
    }
}
