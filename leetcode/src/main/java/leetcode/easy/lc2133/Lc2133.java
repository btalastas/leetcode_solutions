package leetcode.easy.lc2133;

import java.util.HashSet;

public class Lc2133 {
    public boolean checkValid(int[][] matrix) {

        int n = matrix.length;

        // Check each row
        for (int[] row : matrix) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : row) {
                set.add(num);
            }
            if (set.size() != n)
                return false; // Row does not contain all numbers
        }

        // Check each column
        for (int col = 0; col < n; col++) {
            HashSet<Integer> set = new HashSet<>();
            for (int row = 0; row < n; row++) {
                set.add(matrix[row][col]);
            }
            if (set.size() != n)
                return false; // Column does not contain all numbers
        }

        return true; // All rows and columns are valid
    }
}
