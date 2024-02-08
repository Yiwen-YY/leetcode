package pers.yiwen.hashtable._1002;

import java.util.ArrayList;
import java.util.List;
// Find Common Characters
public class Solution {
    public List<String> commonChars(String[] words) {
        int[] letters = new int[26];

        for (int i = 0; i < words[0].length(); i++) {
            letters[words[0].charAt(i) - 'a']++;
        }

        if (words.length > 1) {
            for (int i = 1; i < words.length; i++) {
                int[] temp = new int[26];
                for (int j = 0; j < words[i].length(); j++) {
                    temp[words[i].charAt(j) - 'a']++;
                }

                for (int j = 0; j < letters.length; j++) {
                    if (temp[j] < letters[j])
                        letters[j] = temp[j];
                }
            }
        }

        List<String> common = new ArrayList<String>();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0) {
                for (int j = 0; j < letters[i]; j++) {
                    common.add(String.valueOf((char)('a' + i)));
                }
            }
        }

        return common;
    }

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};

        Solution solution = new Solution();
        List<String> common = solution.commonChars(words);

//        for (int i = 0; i < common.size(); i++) {
//            System.out.println(common.get(i));
//        }
        for (String s : common) {
            System.out.println(s);
        }
    }
}
