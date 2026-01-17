package leetcode.easy.lc2133;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class Lc2133Test {
    /**
     * Example 1:
     * 
     * ```bash
     * Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
     * Output: true
     * Explanation: In this case, n = 3, and every row and column contains the
     * numbers 1, 2, and 3.
     * Hence, we return true.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
     * Output: false
     * Explanation: In this case, n = 3, but the first row and the first column do
     * not contain the numbers 2 or 3.
     * Hence, we return false.
     * ```
     */

    private final Lc2133 solution = new Lc2133();

    @Test
    void checkValidExample1() {
        int[][] matrix = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
        assertTrue(solution.checkValid(matrix));
    }

    @Test
    void checkValidExample2() {
        int[][] matrix = { { 1, 1, 1 }, { 1, 2, 3 }, { 1, 2, 3 } };
        assertFalse(solution.checkValid(matrix));
    }

}
