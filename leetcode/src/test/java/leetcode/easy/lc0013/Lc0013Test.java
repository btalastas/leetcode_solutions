package leetcode.easy.lc0013;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Lc0013Test {

    private final Lc0013 solution = new Lc0013();

    @Test
    void romanToIntExample1() {
        String s = "III";
        int expected = 3;

        assertEquals(expected, solution.romanToInt(s));
    }

    @Test
    void romanToIntExample2() {
        String s = "LVIII";
        int expected = 58;

        assertEquals(expected, solution.romanToInt(s));

    }

    @Test
    void romanToIntExample3() {
        String s = "MCMXCIV";
        int expected = 1994;

        assertEquals(expected, solution.romanToInt(s));
    }
}