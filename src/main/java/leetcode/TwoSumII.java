package leetcode;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 */
public class TwoSumII {

    public static void main(String[] args) {
        TwoSumII twoSum = new TwoSumII();

        int[] input = {2, 7, 11, 15};

        int[] result = twoSum.twoSum(input, 9);
        System.out.println(result[0] + ", " + result[1]);

    }

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && (i != j)) {
                    return new int[]{i + 1, j + 1};
                }
            }
        return null;
    }
}
