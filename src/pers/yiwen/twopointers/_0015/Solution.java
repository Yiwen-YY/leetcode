package pers.yiwen.twopointers._0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 3Sum
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < nums.length - 1 && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (right < nums.length - 1 && nums[right] == nums [right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0};

        Solution solution = new Solution();
        System.out.println(solution.threeSum(nums));
    }
}
