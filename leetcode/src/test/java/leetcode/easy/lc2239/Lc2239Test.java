package leetcode.easy.lc2239;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc2239Test {
    /**
     * Example 1:
     * 
     * ```bash
     * Input: nums = [-4,-2,1,4,8]
     * Output: 1
     * Explanation:
     * The distance from -4 to 0 is |-4| = 4.
     * The distance from -2 to 0 is |-2| = 2.
     * The distance from 1 to 0 is |1| = 1.
     * The distance from 4 to 0 is |4| = 4.
     * The distance from 8 to 0 is |8| = 8.
     * Thus, the closest number to 0 in the array is 1.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: nums = [2,-1,1]
     * Output: 1
     * Explanation: 1 and -1 are both the closest numbers to 0, so 1 being larger is
     * returned.
     * ```
     */

    private final Lc2239 solution = new Lc2239();

    @Test
    void findClosestNumberExample1() {
        int[] nums = { -4, -2, 1, 4, 8 };
        int expected = 1;
        assertEquals(expected, solution.findClosestNumber(nums));
    }

    @Test
    void findClosestNumberExample2() {
        int[] nums = { 2, -1, 1 };
        int expected = 1;
        assertEquals(expected, solution.findClosestNumber(nums));
    }

}
