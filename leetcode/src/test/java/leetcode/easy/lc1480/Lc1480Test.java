package leetcode.easy.lc1480;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Lc1480Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: nums = [1,1,1,1,1]
     * Output: [1,2,3,4,5]
     * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1,
     * 1+1+1+1+1].
     * ```
     * 
     * Example 3:
     * 
     * ```bash
     * Input: nums = [3,1,2,10,1]
     * Output: [3,4,6,16,17]
     * ```
     */

    private final Lc1480 solution = new Lc1480();

    @Test
    void runningSumExample1() {
        int[] nums = { 1, 2, 3, 4 };
        int[] expected = { 1, 3, 6, 10 };
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    void runningSumExample2() {
        int[] nums = { 1, 1, 1, 1, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };
        assertArrayEquals(expected, solution.runningSum(nums));
    }

    @Test
    void runningSumExample3() {
        int[] nums = { 3, 1, 2, 10, 1 };
        int[] expected = { 3, 4, 6, 16, 17 };
        assertArrayEquals(expected, solution.runningSum(nums));
    }
}
