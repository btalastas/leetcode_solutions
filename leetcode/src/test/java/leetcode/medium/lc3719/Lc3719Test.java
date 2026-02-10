package leetcode.medium.lc3719;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Lc3719Test {
    private final Lc3719 solution = new Lc3719();

    @Test
    void longestBalancedExample1() {
        int[] nums = { 2, 5, 4, 3 };
        int expected = 4;

        assertEquals(expected, solution.longestBalanced(nums));
    }

    @Test
    void longestBalancedExample2() {
        int[] nums = { 3, 2, 2, 5, 4 };
        int expected = 5;

        assertEquals(expected, solution.longestBalanced(nums));
    }

    @Test
    void longestBalancedExample3() {
        int[] nums = { 1, 2, 3, 2 };
        int expected = 3;

        assertEquals(expected, solution.longestBalanced(nums));
    }

    @Test
    void longestBalancedExample4() {
        int[] nums = { 10, 5, 7 };
        int expected = 2;

        assertEquals(expected, solution.longestBalanced(nums));
    }
}
