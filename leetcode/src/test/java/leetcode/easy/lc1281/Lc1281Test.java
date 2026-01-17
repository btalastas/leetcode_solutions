package leetcode.easy.lc1281;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc1281Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: n = 234
     * Output: 15
     * Explanation:
     * Product of digits = 2 * 3 * 4 = 24
     * Sum of digits = 2 + 3 + 4 = 9
     * Result = 24 - 9 = 15
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: n = 4421
     * Output: 21
     * Explanation:
     * Product of digits = 4 * 4 * 2 * 1 = 32
     * Sum of digits = 4 + 4 + 2 + 1 = 11
     * Result = 32 - 11 = 21
     * ```
     */

    private final Lc1281 solution = new Lc1281();

    @Test
    void subtractProductAndSum1() {
        int n = 234;
        int expected = 15;
        assertEquals(expected, solution.subtractProductAndSum(n));
    }

    @Test
    void subtractProductAndSum2() {
        int n = 4421;
        int expected = 21;
        assertEquals(expected, solution.subtractProductAndSum(n));
    }

}
