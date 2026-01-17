package leetcode.easy.lc1929;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Lc1929Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
     * - ans = [1,2,1,1,2,1]
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: nums = [1,3,2,1]
     * Output: [1,3,2,1,1,3,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
     * - ans = [1,3,2,1,1,3,2,1]
     * ```
     */

    private final Lc1929 solution = new Lc1929();

    @Test
    void getConcatenationExample1() {
        int[] nums = { 1, 2, 1 };
        int[] expected = { 1, 2, 1, 1, 2, 1 };
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }

    @Test
    void getConcatenationExample2() {
        int[] nums = { 1, 3, 2, 1 };
        int[] expected = { 1, 3, 2, 1, 1, 3, 2, 1 };
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }

}
