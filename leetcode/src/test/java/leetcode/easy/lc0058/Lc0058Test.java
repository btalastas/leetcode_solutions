package leetcode.easy.lc0058;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc0058Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: s = "Hello World"
     * Output: 5
     * Explanation: The last word is "World" with length 5.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: s = " fly me to the moon "
     * Output: 4
     * Explanation: The last word is "moon" with length 4.
     * ```
     * 
     * Example 3:
     * 
     * ```bash
     * Input: s = "luffy is still joyboy"
     * Output: 6
     * Explanation: The last word is "joyboy" with length 6.
     * ```
     */

    private final Lc0058 solution = new Lc0058();

    @Test
    void example1() {
        String s = "Hello World";
        int expected = 5;
        assertEquals(expected, solution.lengthOfLastWord(s));
    }

    @Test
    void example2() {
        String s = " fly me to the moon ";
        int expected = 4;
        assertEquals(expected, solution.lengthOfLastWord(s));
    }

    @Test
    void example3() {
        String s = "luffy is still joyboy";
        int expected = 6;
        assertEquals(expected, solution.lengthOfLastWord(s));
    }
}
