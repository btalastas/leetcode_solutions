package leetcode.easy.lc0121;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc0121Test {
    private final Lc0121 solution = new Lc0121();

    @Test
    void maxProfitExample1() {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int expected = 5;

        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    void maxProfitExample2() {
        int[] prices = { 7, 6, 4, 3, 1 };
        int expected = 0;

        assertEquals(expected, solution.maxProfit(prices));
    }
}
