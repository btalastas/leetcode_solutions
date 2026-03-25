package leetcode.medium.lc2906;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Lc2906Test {

    private final Lc2906 solution = new Lc2906();

    @Test
    void constructProductMatrixExample1() {
        int[][] grid = { { 1, 2 }, { 3, 4 } };
        int[][] expected = { { 24, 12 }, { 8, 6 } };

        assertArrayEquals(expected, solution.constructProductMatrix(grid));
    }

    @Test
    void constructProductMatrixExample2() {
        int[][] grid = { { 12345 }, { 2 }, { 1 } };
        int[][] expected = { { 2 }, { 0 }, { 0 } };

        assertArrayEquals(expected, solution.constructProductMatrix(grid));
    }

    @Test
    void constructProductMatrixSingleRow() {
        int[][] grid = { { 2, 3, 4 } };
        int[][] expected = { { 12, 8, 6 } };

        assertArrayEquals(expected, solution.constructProductMatrix(grid));
    }

    @Test
    void constructProductMatrixWithZero() {
        int[][] grid = { { 0, 2 }, { 3, 4 } };
        int[][] expected = { { 24, 0 }, { 0, 0 } };

        assertArrayEquals(expected, solution.constructProductMatrix(grid));
    }

    @Test
    void constructProductMatrixAllOnes() {
        int[][] grid = { { 1, 1 }, { 1, 1 } };
        int[][] expected = { { 1, 1 }, { 1, 1 } };

        assertArrayEquals(expected, solution.constructProductMatrix(grid));
    }

    @Test
    void constructProductMatrixLargeValuesSingleColumn() {
        int[][] grid = { { 414750857 }, { 449145368 }, { 767292749 } };
        int[][] expected = { { 1462 }, { 3103 }, { 9436 } };

        assertArrayEquals(expected, solution.constructProductMatrix(grid));
    }

}
