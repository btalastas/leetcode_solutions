package leetcode.easy.lc1512;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc1512Test {
    /**
     * Example 1:
     * 
     * ```bash
     * Input: nums = [1,2,3,1,1,3]
     * Output: 4
     * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: nums = [1,1,1,1]
     * Output: 6
     * Explanation: Each pair in the array are good.
     * ```
     * 
     * Example 3:
     * 
     * ```bash
     * Input: nums = [1,2,3]
     * Output: 0
     * ```
     */

    private final Lc1512 solution = new Lc1512();

    @Test
    void numIdenticalPairsExample1() {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        int expected = 4;
        assertEquals(expected, solution.numIdenticalPairs(nums));
    }

    @Test
    void numIdenticalPairsExample2() {
        int[] nums = { 1, 1, 1, 1 };
        int expected = 6;
        assertEquals(expected, solution.numIdenticalPairs(nums));
    }

    @Test
    void numIdenticalPairsExample3() {
        int[] nums = { 1, 2, 3 };
        int expected = 0;
        assertEquals(expected, solution.numIdenticalPairs(nums));
    }
}
