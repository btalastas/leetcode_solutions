package leetcode.medium.lc3546;

public class Lc3546 {
    public boolean canPartitionGrid(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        long totalSum = 0;

        // find total sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                totalSum += grid[i][j];
            }
        }

        // vertical cut test
        // cut through the grid and compare the sums of the left and right half
        // if partitions have the same sum return true, otherwise increment index of cut
        long prefixSum = 0;
        for (int i = 0; i < cols - 1; i++) {

            for (int j = 0; j < rows; j++) {
                prefixSum += grid[j][i];
            }

            if (prefixSum == totalSum - prefixSum) {
                return true;
            }
        }

        // horizontal cut test
        // cut through the grid and compare the sums of the top and bottom half
        // if partitions have the same sum return true, otherwise increment index of the
        // cut
        prefixSum = 0;
        for (int i = 0; i < rows - 1; i++) {

            for (int j = 0; j < cols; j++) {
                prefixSum += grid[i][j];
            }

            if (prefixSum == totalSum - prefixSum) {
                return true;
            }
        }

        return false;
    }
}
