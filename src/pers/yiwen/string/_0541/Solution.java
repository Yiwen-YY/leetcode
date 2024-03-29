package pers.yiwen.string._0541;
// Reverse String II
public class Solution {
    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();

        for (int i = 0; str.length > i * 2 * k; i++) {
            int left = i * 2 * k;
            int right;
            if (str.length < (i * 2 + 1) * k) {
                right = str.length - 1;
            } else {
                right = (i * 2 + 1) * k - 1;
            }

            while (left < right) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }

        return new String(str);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;

        Solution solution = new Solution();
        System.out.println(solution.reverseStr(s, k));
    }
}
