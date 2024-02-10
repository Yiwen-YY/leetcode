package pers.yiwen.hashtable._0202;

import java.util.HashSet;

// Happy Number
public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> sites = new HashSet<Integer>();
        sites.add(n);

        int sum = n;
        while (sum != 1) {
            int num = n % 10;
            sum = num * num;
            while (n != 0) {
                n = n / 10;
                num = n % 10;
                sum += num * num;
            }

            if (sites.contains(sum)) {
                return false;
            }
            sites.add(sum);
            n = sum;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 2;

        Solution solution = new Solution();
        System.out.println(solution.isHappy(n));
    }
}
