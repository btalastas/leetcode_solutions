package leetcode.easy.lc1920;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Lc1920Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: nums = [0,2,1,5,3,4]
     * Output: [0,1,2,4,5,3]
     * Explanation: The array ans is built as follows:
     * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]],
     * nums[nums[4]], nums[nums[5]]]
     * = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
     * = [0,1,2,4,5,3]
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: nums = [5,0,1,2,3,4]
     * Output: [4,5,0,1,2,3]
     * Explanation: The array ans is built as follows:
     * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]],
     * nums[nums[4]], nums[nums[5]]]
     * = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
     * = [4,5,0,1,2,3]
     * ```
     */

    private final Lc1920 solution = new Lc1920();

    @Test
    void buildArrayExample1() {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] expected = { 0, 1, 2, 4, 5, 3 };
        assertArrayEquals(expected, solution.buildArray(nums));
    }

    @Test
    void buildArrayExample2() {
        int[] nums = { 5, 0, 1, 2, 3, 4 };
        int[] expected = { 4, 5, 0, 1, 2, 3 };
        assertArrayEquals(expected, solution.buildArray(nums));
    }
}
