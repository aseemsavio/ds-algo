package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(9, 5, 6, 3, 11, 8, 0, 23, 23, 45, 76, 45, 89, 8, 5, 6, 7, 8, 9, 33, 44, 77, 55, 66, 22, 33, 43, 678, 234, 56, 87, 98, 34, 23, 56, 76, 876, 123, 234, 543, 654, 765, 854, 365, 367,456, 654, 321, 23, 54, 77, 88, 99, 44, 55, 66, 77, 84, 35, 46, 57, 97, 80, 10, 20, 92, 83, 54, 32, 76, 87, 98, 9, 43, 11, 99, 88, 77, 66, 55, 444, 333, 222, 234, 456, 666, 777, 876, 444, 555, 666, 777, 888, 999, 98, 11);

        List<Integer> input = list.stream().collect(Collectors.toList());
        Sorting sorting = new BubbleSort();
        System.out.println(sorting.sort(input));

        input = list.stream().collect(Collectors.toList());
        sorting = new SelectionSort();
        System.out.println(sorting.sort(input));

    }

}
