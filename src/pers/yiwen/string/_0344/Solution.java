package pers.yiwen.string._0344;
// Reverse String
public class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        Solution solution = new Solution();
        solution.reverseString(s);
        System.out.println(s);
    }
}
