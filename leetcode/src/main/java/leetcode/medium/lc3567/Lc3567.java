package leetcode.medium.lc3567;

import java.util.Arrays;

public class Lc3567 {

    public int[][] minAbsDiff(int[][] grid, int k) {

        int rows = grid.length;
        int cols = grid[0].length;
        int[][] ans = new int[rows - k + 1][cols - k + 1];

        for (int r = 0; r <= rows - k; r++) {
            for (int c = 0; c <= cols - k; c++) {
                int[] subMatrix = new int[k * k];
                int index = 0;
                for (int i = r; i < r + k; i++) {
                    for (int j = c; j < c + k; j++) {
                        subMatrix[index++] = grid[i][j];
                    }
                }
                // finished current submatrix
                Arrays.sort(subMatrix);
                int min = Integer.MAX_VALUE;

                for (int i = 0; i < subMatrix.length - 1; i++) {
                    if (subMatrix[i] == subMatrix[i + 1]) {
                        continue;
                    }
                    min = Math.min(min, subMatrix[i + 1] - subMatrix[i]);
                }
                if (min == Integer.MAX_VALUE) {
                    min = 0;
                }
                ans[r][c] = min;
            }
        }

        return ans;
    }
}
