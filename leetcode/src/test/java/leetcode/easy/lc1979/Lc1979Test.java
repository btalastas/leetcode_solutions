package leetcode.easy.lc1979;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc1979Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: nums = [2,5,6,9,10]
     * Output: 2
     * Explanation:
     * The smallest number in nums is 2.
     * The largest number in nums is 10.
     * The greatest common divisor of 2 and 10 is 2.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: nums = [7,5,6,8,3]
     * Output: 1
     * Explanation:
     * The smallest number in nums is 3.
     * The largest number in nums is 8.
     * The greatest common divisor of 3 and 8 is 1.
     * Example 3:
     * 
     * Input: nums = [3,3]
     * Output: 3
     * Explanation:
     * The smallest number in nums is 3.
     * The largest number in nums is 3.
     * The greatest common divisor of 3 and 3 is 3.
     * ```
     */

    private final Lc1979 solution = new Lc1979();

    @Test
    void findGCDExample1() {
        int[] nums = { 2, 5, 6, 9, 10 };
        int expected = 2;
        assertEquals(expected, solution.findGCD(nums));
    }

    @Test
    void findGCDExample2() {
        int[] nums = { 7, 5, 6, 8, 3 };
        int expected = 1;
        assertEquals(expected, solution.findGCD(nums));
    }

}
