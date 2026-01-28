package leetcode.easy.lc0066;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Lc0066Test {
    private final Lc0066 solution = new Lc0066();

    @Test
    void plusOneExample1() {
        int[] digits = { 1, 2, 3 };
        int[] expected = { 1, 2, 4 };

        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    void plusOneExample2() {
        int[] digits = { 4, 3, 2, 1 };
        int[] expected = { 4, 3, 2, 2 };

        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    void plusOneExample3() {
        int[] digits = { 9 };
        int[] expected = { 1, 0 };

        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    void plusOneExample4() {
        int[] digits = { 9, 9, 9, 9 };
        int[] expected = { 1, 0, 0, 0, 0 };

        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    void plusOneExample5() {
        int[] digits = { 8, 9, 9, 9 };
        int[] expected = { 9, 0, 0, 0 };

        assertArrayEquals(expected, solution.plusOne(digits));
    }
}
