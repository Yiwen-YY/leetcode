package pers.yiwen.stackandqueue._0150;

import java.util.Objects;
import java.util.Stack;

// Evaluate Reverse Polish Notation
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        int num1, num2;
        for (String s : tokens) {
            if (Objects.equals(s, "+")) {
                num2 = st.pop();
                num1 = st.pop();
                st.push(num1 + num2);
            } else if (Objects.equals(s, "-")) {
                num2 = st.pop();
                num1 = st.pop();
                st.push(num1 - num2);
            } else if (Objects.equals(s, "*")) {
                num2 = st.pop();
                num1 = st.pop();
                st.push(num1 * num2);
            } else if (Objects.equals(s, "/")) {
                num2 = st.pop();
                num1 = st.pop();
                st.push(num1 / num2);
            } else {
                st.push(Integer.valueOf(s));
            }

        }

        return st.pop();
    }
}
