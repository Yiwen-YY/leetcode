package pers.yiwen.hashtable._0383;

import java.util.HashMap;

// Ransom Note
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            letters.put(m, letters.getOrDefault(m, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            if (!letters.containsKey(r) || letters.get(r) == 0) {
                return false;
            }

            letters.put(r, letters.get(r) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";

        Solution solution = new Solution();
        System.out.println(solution.canConstruct(ransomNote, magazine));
    }
}
