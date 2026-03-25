package leetcode.medium.lc3546;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class Lc3546Test {
    private final Lc3546 solution = new Lc3546();

    @Test
    void canPartitionGridExampe1() {
        // [[1,4],[2,3]]
        int[][] grid = { { 1, 4 }, { 2, 3 } };

        assertTrue(solution.canPartitionGrid(grid));
    }

    @Test
    void canPartitionGridExample2() {
        // [[1,3],[2,4]]
        int[][] grid = { { 1, 3 }, { 2, 4 } };

        assertFalse(solution.canPartitionGrid(grid));
    }

    @Test
    void canPartitionGridExample3() {
        // [[14742,71685,59237,27190]]
        int[][] grid = { { 14742, 71685, 59237, 27190 } };

        assertTrue(solution.canPartitionGrid(grid));
    }
}
