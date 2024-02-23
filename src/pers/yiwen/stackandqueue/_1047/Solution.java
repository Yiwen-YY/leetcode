package pers.yiwen.stackandqueue._1047;

import java.util.Stack;

// Remove All Adjacent Duplicates In String
public class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.empty() && ch == st.peek()) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        char[] arr = new char[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String s = "abbaca";

        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(s));
    }
}
