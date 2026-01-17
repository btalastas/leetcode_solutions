package leetcode.easy.lc1588;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc1588Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: arr = [1,4,2,5,3]
     * Output: 58
     * Explanation: The odd-length subarrays of arr and their sums are:
     * [1] = 1
     * [4] = 4
     * [2] = 2
     * [5] = 5
     * [3] = 3
     * [1,4,2] = 7
     * [4,2,5] = 11
     * [2,5,3] = 10
     * [1,4,2,5,3] = 15
     * If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: arr = [1,2]
     * Output: 3
     * Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum
     * is 3.
     * ```
     * 
     * Example 3:
     * 
     * ```bash
     * Input: arr = [10,11,12]
     * Output: 66
     * ```
     */

    private final Lc1588 solution = new Lc1588();

    @Test
    void sumOddLengthSubarraysExample1() {
        int[] arr = { 1, 4, 2, 5, 3 };
        int expected = 58;
        assertEquals(expected, solution.sumOddLengthSubarrays(arr));
    }

    @Test
    void sumOddLengthSubarraysExample2() {
        int[] arr = { 1, 2 };
        int expected = 3;
        assertEquals(expected, solution.sumOddLengthSubarrays(arr));
    }

    @Test
    void sumOddLengthSubarraysExample3() {
        int[] arr = { 10, 11, 12 };
        int expected = 66;
        assertEquals(expected, solution.sumOddLengthSubarrays(arr));
    }
}
