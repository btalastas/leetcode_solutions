package leetcode.easy.lc1672;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc1672Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: accounts = [[1,2,3],[3,2,1]]
     * Output: 6
     * Explanation:
     * 1st customer has wealth = 1 + 2 + 3 = 6
     * 2nd customer has wealth = 3 + 2 + 1 = 6
     * Both customers are considered the richest with a wealth of 6 each, so return
     * 6.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: accounts = [[1,5],[7,3],[3,5]]
     * Output: 10
     * Explanation:
     * 1st customer has wealth = 6
     * 2nd customer has wealth = 10
     * 3rd customer has wealth = 8
     * The 2nd customer is the richest with a wealth of 10.
     * ```
     * 
     * Example 3:
     * 
     * ```bash
     * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
     * Output: 17
     * ```
     */

    private final Lc1672 solution = new Lc1672();

    @Test
    void maximumWealthExample1() {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        int expected = 6;
        assertEquals(expected, solution.maximumWealth(accounts));
    }

    @Test
    void maximumWealthExample2() {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        int expected = 10;
        assertEquals(expected, solution.maximumWealth(accounts));
    }

    @Test
    void maximumWealthExample3() {
        int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        int expected = 17;
        assertEquals(expected, solution.maximumWealth(accounts));
    }
}
