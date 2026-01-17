package leetcode.easy.lc1470;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Lc1470Test {
    /**
     * Example 1:
     * 
     * ```bash
     * Input: nums = [2,5,1,3,4,7], n = 3
     * Output: [2,3,5,4,1,7]
     * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is
     * [2,3,5,4,1,7].
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: nums = [1,2,3,4,4,3,2,1], n = 4
     * Output: [1,4,2,3,3,2,4,1]
     * ```
     * 
     * Example 3:
     * 
     * ```bash
     * Input: nums = [1,1,2,2], n = 2
     * Output: [1,2,1,2]
     * ```
     */

    private final Lc1470 solution = new Lc1470();

    @Test
    void shuffleExample1() {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] expected = { 2, 3, 5, 4, 1, 7 };
        assertArrayEquals(expected, solution.shuffle(nums, n));
    }

    @Test
    void shuffleExample2() {
        int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };
        int n = 4;
        int[] expected = { 1, 4, 2, 3, 3, 2, 4, 1 };
        assertArrayEquals(expected, solution.shuffle(nums, n));
    }

    @Test
    void shuffleExample3() {
        int[] nums = { 1, 1, 2, 2 };
        int n = 2;
        int[] expected = { 1, 2, 1, 2 };
        assertArrayEquals(expected, solution.shuffle(nums, n));
    }
}
