package leetcode.medium.lc3653;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc3653Test {
    private final Lc3653 solution = new Lc3653();

    @Test
    void xorAfterQueriesExample1() {
        int[] nums = { 1, 1, 1 };
        int[][] queries = { { 0, 2, 1, 4 } };
        int expected = 4;

        assertEquals(expected, solution.xorAfterQueries(nums, queries));
    }

    @Test
    void xorAfterQueriesExample2() {
        int[] nums = { 2, 3, 1, 5, 4 };
        int[][] queries = { { 1, 4, 2, 3 }, { 0, 2, 1, 2 } };
        int expected = 31;

        assertEquals(expected, solution.xorAfterQueries(nums, queries));
    }

    @Test
    void xorAfterQueriesExample3() {
        int[] nums = { 780 };
        int[][] queries = {
                { 0, 0, 1, 13 },
                { 0, 0, 1, 17 },
                { 0, 0, 1, 9 },
                { 0, 0, 1, 18 },
                { 0, 0, 1, 16 },
                { 0, 0, 1, 6 },
                { 0, 0, 1, 4 },
                { 0, 0, 1, 11 },
                { 0, 0, 1, 7 },
                { 0, 0, 1, 18 },
                { 0, 0, 1, 8 },
                { 0, 0, 1, 15 },
                { 0, 0, 1, 12 }
        };
        int expected = 523618060;

        assertEquals(expected, solution.xorAfterQueries(nums, queries));
    }

}
