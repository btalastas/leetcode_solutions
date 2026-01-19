package leetcode.medium.lc0007;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc0007Test {

    private final Lc0007 solution = new Lc0007();

    @Test
    void reverseExample1() {
        int x = 123;
        int expected = 321;
        assertEquals(expected, solution.reverse(x));
    }

    @Test
    void reverseExample2() {
        int x = -123;
        int expected = -321;
        assertEquals(expected, solution.reverse(x));
    }

    @Test
    void reverseExample3() {
        int x = 120;
        int expected = 21;
        assertEquals(expected, solution.reverse(x));
    }

    @Test
    void reverseExample4() {
        int x = 1534236469;
        int expected = 0;
        assertEquals(expected, solution.reverse(x));
    }

    @Test
    void reverseExample5() {
        int x = -2147483412;
        int expected = -2143847412;
        assertEquals(expected, solution.reverse(x));
    }

}
