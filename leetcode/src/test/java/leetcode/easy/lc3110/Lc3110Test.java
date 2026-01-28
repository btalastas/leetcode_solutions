package leetcode.easy.lc3110;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Lc3110Test {
    private final Lc3110 solution = new Lc3110();

    @Test
    void scoreOfStringExample1() {
        String s = "hello";
        int expected = 13;

        assertEquals(expected, solution.scoreOfString(s));
    }

    @Test
    void scoreOfStringExample2() {
        String s = "zaz";
        int expected = 50;

        assertEquals(expected, solution.scoreOfString(s));
    }
}
