package pers.yiwen.array._0209;
// Minimum Size Subarray Sum
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum < target) {
            return 0;
        }

        sum = 0;
        int temp;
        int result = 0;
        for (int i = 0, j = 0; j < nums.length; j++) {
            sum += nums[j];

            while (sum >= target) {
                temp = j - i + 1;
                if (result > temp || result == 0) {
                    result = temp;
                }
                sum -= nums[i];
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println(solution.minSubArrayLen(target, nums));
    }
}
