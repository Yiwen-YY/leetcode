package pers.yiwen.hashtable._0349;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Intersection of Two Arrays
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] nums = new int[1001];

        for (int num:nums1) {
            nums[num] = 1;
        }

        for (int num:nums2) {
            if (nums[num] == 1)
                nums[num] = 2;
        }

        List<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                intersection.add(i);
            }
        }

        int[] result = new int[intersection.size()];

        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.intersection(nums1, nums2)));
    }
}
