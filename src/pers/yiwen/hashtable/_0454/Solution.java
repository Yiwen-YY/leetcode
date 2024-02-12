package pers.yiwen.hashtable._0454;

import java.util.HashMap;

// 4Sum II
public class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> sums = new HashMap<>();

        for (int num1:nums1) {
            for (int num2:nums2) {
                int sum = num1 + num2;
                sums.put(sum, sums.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;
        for (int num3:nums3) {
            for (int num4:nums4) {
                count += sums.getOrDefault(-num3 - num4, 0);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};

        Solution solution = new Solution();
        System.out.println(solution.fourSumCount(nums1, nums2, nums3, nums4));
    }
}
