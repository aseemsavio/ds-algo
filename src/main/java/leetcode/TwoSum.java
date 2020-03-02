package leetcode;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        TwoSum twoSum = new TwoSum();
        int[] indices = twoSum.twoSum(input, 9);

        System.out.println(indices[0] + ", " + indices[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }

}
