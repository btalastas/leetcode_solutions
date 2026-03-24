package leetcode.medium.lc3567;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Lc3567Test {

    private final Lc3567 solution = new Lc3567();

    @Test
    void minAbsDiffExample1() {
        int[][] grid = { { 1, 8 }, { 3, -2 } };
        int[][] expected = { { 2 } };
        int k = 2;

        assertArrayEquals(expected, solution.minAbsDiff(grid, k));
    }

    @Test
    void minAbsDiffExample2() {
        int[][] grid = { { 3, 1 } };
        int[][] expected = { { 0, 0 } };
        int k = 1;

        assertArrayEquals(expected, solution.minAbsDiff(grid, k));
    }

    @Test
    void minAbsDiffExample3() {
        int[][] grid = { { 1, -2, 3 }, { 2, 3, 5 } };
        int[][] expected = { { 1, 2 } };
        int k = 2;

        assertArrayEquals(expected, solution.minAbsDiff(grid, k));
    }
}
