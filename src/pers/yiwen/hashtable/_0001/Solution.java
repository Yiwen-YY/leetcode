package pers.yiwen.hashtable._0001;

import java.util.Arrays;
import java.util.HashMap;

// Two Sum
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sites = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int key:sites.keySet()) {
                if (nums[i] + key == target) {
                    return new int[]{i, sites.get(key)};
                }
            }

            sites.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11 , 5};
        int target = 9;

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

}
