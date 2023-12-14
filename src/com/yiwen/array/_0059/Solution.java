package com.yiwen.array._0059;

import java.util.Arrays;

// Spiral Matrix II
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int num = 1;
        for (int layer = 0; layer <= (n + 1) / 2; layer++) {
            int i, j;
            for (i = layer, j = layer; j < n - layer; j++){
                matrix[i][j] = num;
                num++;
            }
            for (i = layer + 1, j = n - layer - 1; i < n - layer; i++){
                matrix[i][j] = num;
                num++;
            }
            for (i = n - layer - 1, j = n - layer - 2; j >= layer; j--){
                matrix[i][j] = num;
                num++;
            }
            for (i = n - layer - 2, j = layer; i > layer; i--){
                matrix[i][j] = num;
                num++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;

        System.out.println(Arrays.deepToString(solution.generateMatrix(n)));
    }
}
