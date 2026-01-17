package leetcode.easy.lc1295;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc1295Test {
    /**
     * Example 1:
     * 
     * ```bash
     * Input: nums = [12,345,2,6,7896]
     * Output: 2
     * Explanation:
     * 12 contains 2 digits (even number of digits).
     * 345 contains 3 digits (odd number of digits).
     * 2 contains 1 digit (odd number of digits).
     * 6 contains 1 digit (odd number of digits).
     * 7896 contains 4 digits (even number of digits).
     * Therefore only 12 and 7896 contain an even number of digits.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: nums = [555,901,482,1771]
     * Output: 1
     * Explanation:
     * Only 1771 contains an even number of digits.
     * ```
     */

    private final Lc1295 solution = new Lc1295();

    @Test
    void findNumbersExample1() {
        int[] nums = { 12, 345, 2, 6, 7896 };
        int expected = 2;
        assertEquals(expected, solution.findNumbers(nums));
    }

    @Test
    void findNumbersExample2() {
        int[] nums = { 555, 901, 482, 1771 };
        int expected = 1;
        assertEquals(expected, solution.findNumbers(nums));
    }
}
