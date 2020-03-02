package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/3sum/
 * <p>
 * Time limit exceeded
 */
public class ThreeSum {

    public static void main(String[] args) {

        ThreeSum threeSum = new ThreeSum();
        int[] nums = {10, -2, -12, 3, -15, -12, 2, -11, 3, -12, 9, 12, 0, -5, -4, -2, -7, -15, 7, 4, -5, -14, -15, -15, -4, 10, 9, -6, 7, 1, 12, -6, 14, -15, 12, 14, 10, 0, 10, -10, 3, 4, -12, 10, 7, -9, -7, -15, -8, -15, -4, 2, 9, -4, 3, -10, 13, -3, -1, 5, 5, -4, -15, 4, -11, 4, -4, 6, -11, -9, 12, 7, 11, 7, 2, -5, 13, 10, -5, -10, 3, 7, 0, -3, 10, -12, 2, 9, -8, 8, -9, 13, 12, 13, -6, 8, 3, 5, -9, 7, 12, 10, -8, 0, 2, 1, 10, -7, -3, -10, -10, 7, 4, 5, -11, -8, 0, -2, -14, 8, 13, -8, -2, 10, 13};

        long then = System.currentTimeMillis();
        System.out.println(threeSum.threeSum(nums));
        System.out.println("Time Taken: " + (System.currentTimeMillis() - then) + " ms.");

    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> threeSumList = new ArrayList(nums.length);
        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < nums.length; j++)
                for (int k = 0; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0 && !duplicatesFound(i, j, k)) {
                        List<Integer> result = Arrays.asList(nums[i], nums[j], nums[k])
                                .stream()
                                .sorted()
                                .collect(Collectors.toList());
                        if (!threeSumList.contains(result))
                            threeSumList.add(result);
                    }
                }
        return threeSumList;
    }

    private boolean duplicatesFound(int i, int j, int k) {
        return (i == j || i == k || j == k);
    }
}
