package pers.yiwen.array._0027;

import java.util.Arrays;
// Remove Element
public class Solution {
    public int removeElement(int[] nums, int val) {
        int valNum = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[valNum] = nums[i];
                valNum++;
            }
        }

        return valNum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        System.out.println(solution.removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}
