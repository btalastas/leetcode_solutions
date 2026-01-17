package leetcode.easy.lc2176;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc2176Test {
    /**
     * Example 1:
     * 
     * ```bash
     * Input: nums = [3,1,2,2,2,1,3], k = 2
     * Output: 4
     * Explanation:
     * There are 4 pairs that meet all the requirements:
     * - nums[0] == nums[6], and 0 * 6 == 0, which is divisible by 2.
     * - nums[2] == nums[3], and 2 * 3 == 6, which is divisible by 2.
     * - nums[2] == nums[4], and 2 * 4 == 8, which is divisible by 2.
     * - nums[3] == nums[4], and 3 * 4 == 12, which is divisible by 2.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: nums = [1,2,3,4], k = 1
     * Output: 0
     * Explanation: Since no value in nums is repeated, there are no pairs (i,j)
     * that meet all the requirements.
     * ```
     */

    private final Lc2176 solution = new Lc2176();

    @Test
    void countPairsExample1() {
        int[] nums = { 3, 1, 2, 2, 2, 1, 3 };
        int k = 2;
        long expected = 4;
        assertEquals(expected, solution.countPairs(nums, k));
    }

    @Test
    void countPairsExample2() {
        int[] nums = { 1, 2, 3, 4 };
        int k = 1;
        long expected = 0;
        assertEquals(expected, solution.countPairs(nums, k));
    }

}
