package leetcode.easy.lc3713;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Lc3713Test {
    private final Lc3713 solution = new Lc3713();

    @Test
    void longestBalancedExample1() {
        String s = "abbac";
        int expected = 4;

        assertEquals(expected, solution.longestBalanced(s));
    }

    @Test
    void longestBalancedExample2() {
        String s = "zzabccy";
        int expected = 4;

        assertEquals(expected, solution.longestBalanced(s));
    }

    @Test
    void longestBalancedExample3() {
        String s = "aba";
        int expected = 2;

        assertEquals(expected, solution.longestBalanced(s));
    }

    @Test
    void longestBalancedExample4() {
        String s = "hiiigh";
        int expected = 3;

        assertEquals(expected, solution.longestBalanced(s));
    }

    @Test
    void longestBalancedExample5() {
        String s = "abcabcabc";
        int expected = 2;

        assertEquals(expected, solution.longestBalanced(s));
    }

    @Test
    void longestBalancedExample6() {
        String s = "aabbbc";
        int expected = 2;

        assertEquals(expected, solution.longestBalanced(s));
    }

    @Test
    void longestBalancedExample7() {
        String s = "ab";
        int expected = 2;

        assertEquals(expected, solution.longestBalanced(s));
    }

    @Test
    void longestBalancedExample8() {
        String s = "z";
        int expected = 2;

        assertEquals(expected, solution.longestBalanced(s));
    }

    @Test
    void longestBalancedExample9() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int expected = 2;

        assertEquals(expected, solution.longestBalanced(s));
    }

}

// "aaabbbcccdddde"
// "abcabcabc"
// "aabbbc"
// "ab"
// "z"
// "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
