package leetcode.medium.lc2906;

public class Lc2906 {
    public int[][] constructProductMatrix(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] prefix = new int[rows][cols];
        int[][] suffix = new int[rows][cols];
        int[][] p = new int[rows][cols];

        for (int i = 0; i < rows * cols; i++) {
            int r = i / cols;
            int c = i % cols;
            int previous = i - 1;
            int pr = previous / cols;
            int pc = previous % cols;
            if (i == 0) {
                prefix[r][c] = 1;
            } else {
                prefix[r][c] = (int) ((long) grid[pr][pc] * prefix[pr][pc] % 12345);

            }

        }

        for (int i = rows * cols - 1; i >= 0; i--) {
            int r = i / cols;
            int c = i % cols;
            int next = i + 1;
            int nr = next / cols;
            int nc = next % cols;

            if (i == rows * cols - 1) {
                suffix[r][c] = 1;
            } else {
                suffix[r][c] = (int) ((long) grid[nr][nc] * suffix[nr][nc] % 12345);
            }
        }

        for (int i = 0; i < rows * cols; i++) {
            int r = i / cols;
            int c = i % cols;

            p[r][c] = prefix[r][c] * suffix[r][c] % 12345;
        }

        return p;
    }
}
