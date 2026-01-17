package leetcode.easy.lc0001;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Lc0001Test {

    /**
     * ```Java
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * ```
     * 
     * Example 2:
     * 
     * ```Java
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * ```
     * 
     * Example 3:
     * 
     * ```Java
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * ```
     */

    private final Lc0001 solution = new Lc0001();

    @Test
    void example1() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void example2() {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    void example3() {
        int[] nums = { 3, 3 };
        int target = 6;
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}
