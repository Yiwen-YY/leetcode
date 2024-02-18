package pers.yiwen.string._0151;

// Reverse Words in a String
public class Solution {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();

        reverse(str, 0, str.length - 1);
        reverseWords(str, str.length);

        return cleanSpaces(str, str.length);
    }

    private void reverseWords(char[]str, int len) {
        int left = 0, right = 0;

        while (left < len) {
            while (left < right || left < len && str[left] == ' ') {
                left++;
            }
            while (right < left || right < len && str[right] != ' ') {
                right++;
            }
            reverse(str, left, right - 1);
        }
    }

    private void reverse(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }
    }

    String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && a[j] == ' ') j++;             // skip spaces
            while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
            while (j < n && a[j] == ' ') j++;             // skip spaces
            if (j < n) a[i++] = ' ';                      // keep only one space
        }

        return new String(a).substring(0, i);
    }
    public static void main(String[] args) {
        String s = "  hello world  ";

        Solution solution = new Solution();
        System.out.println(solution.reverseWords(s));
    }
}
