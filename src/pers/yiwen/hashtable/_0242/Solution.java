package pers.yiwen.hashtable._0242;
// Valid Anagram
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i) - 'a']--;
        }

        for (int letter : letters) {
            if (letter != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        Solution solution = new Solution();
        System.out.println(solution.isAnagram(s, t));
    }
}
