package com.yiwen.array._0977;

import java.util.Arrays;

// Squares of a Sorted Array
public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if(nums[left] * nums[left] > nums[right] * nums[right]) {
                result[i] = nums[left] * nums[left];
                left ++;
            } else {
                result[i] = nums[right] * nums[right];
                right --;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(solution.sortedSquares(nums)));
    }
}
