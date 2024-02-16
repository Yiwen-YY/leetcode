package pers.yiwen.string._0151;
// Reverse Words in a String
public class Solution {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();

        int index = 0;
        while (str[index] == ' ') {
            index++;
        }
        str = removeSpace(str, 0, index);

        return s;
    }

    public char[] removeSpace(char[] str, int pre, int behind) {
        while (behind < str.length){
            str[pre] = str[behind + 1];
            pre++;
            behind++;
        }
        return str;
    }
}
