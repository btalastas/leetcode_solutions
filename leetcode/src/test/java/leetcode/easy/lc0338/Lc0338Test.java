package leetcode.easy.lc0338;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Lc0338Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: n = 2
     * Output: [0,1,1]
     * Explanation:
     * 0 --> 0
     * 1 --> 1
     * 2 --> 10
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: n = 5
     * Output: [0,1,1,2,1,2]
     * Explanation:
     * 0 --> 0
     * 1 --> 1
     * 2 --> 10
     * 3 --> 11
     * 4 --> 100
     * 5 --> 101
     * ```
     */

    private final Lc0338 solution = new Lc0338();

    @Test
    void example1() {
        int n = 2;
        int expected[] = { 0, 1, 1 };
        assertArrayEquals(expected, solution.countBits(n));
    }

    @Test
    void example2() {
        int n = 5;
        int expected[] = { 0, 1, 1, 2, 1, 2 };
        assertArrayEquals(expected, solution.countBits(n));
    }
}
