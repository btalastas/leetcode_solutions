package leetcode.easy.lc0682;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc0682Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: ops = ["5","2","C","D","+"]
     * Output: 30
     * Explanation:
     * "5" - Add 5 to the record, record is now [5].
     * "2" - Add 2 to the record, record is now [5, 2].
     * "C" - Invalidate and remove the previous score, record is now [5].
     * "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
     * "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
     * The total sum is 5 + 10 + 15 = 30.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: ops = ["5","-2","4","C","D","9","+","+"]
     * Output: 27
     * Explanation:
     * "5" - Add 5 to the record, record is now [5].
     * "-2" - Add -2 to the record, record is now [5, -2].
     * "4" - Add 4 to the record, record is now [5, -2, 4].
     * "C" - Invalidate and remove the previous score, record is now [5, -2].
     * "D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
     * "9" - Add 9 to the record, record is now [5, -2, -4, 9].
     * "+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
     * "+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
     * The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
     * ```
     * 
     * Example 3:
     * 
     * ```bash
     * Input: ops = ["1","C"]
     * Output: 0
     * Explanation:
     * "1" - Add 1 to the record, record is now [1].
     * "C" - Invalidate and remove the previous score, record is now [].
     * Since the record is empty, the total sum is 0.
     * ```
     */

    private final Lc0682 lc0682 = new Lc0682();

    @Test
    void calPointsExample1() {
        String[] ops = { "5", "2", "C", "D", "+" };
        int expected = 30;
        assertEquals(expected, lc0682.calPoints(ops));
    }

    @Test
    void calPointsExample2() {
        String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        int expected = 27;
        assertEquals(expected, lc0682.calPoints(ops));
    }

    @Test
    void calPointsExample3() {
        String[] ops = { "1", "C" };
        int expected = 0;
        assertEquals(expected, lc0682.calPoints(ops));
    }
}
