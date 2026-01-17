package leetcode.easy.lc0455;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc0455Test {
    /**
     * Example 1:
     * 
     * ```bash
     * Input: g = [1,2,3], s = [1,1]
     * Output: 1
     * Explanation: You have 3 children and 2 cookies. The greed factors of 3
     * children are 1, 2, 3.
     * And even though you have 2 cookies, since their size is both 1, you could
     * only make the child whose greed factor is 1 content.
     * You need to output 1.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: g = [1,2], s = [1,2,3]
     * Output: 2
     * Explanation: You have 2 children and 3 cookies. The greed factors of 2
     * children are 1, 2.
     * You have 3 cookies and their sizes are big enough to gratify all of the
     * children,
     * You need to output 2.
     * ```
     */

    private final Lc0455 solution = new Lc0455();

    @Test
    void example1() {
        int[] g = { 1, 2, 3 };
        int[] s = { 1, 1 };
        int expected = 1;
        assertEquals(expected, solution.findContentChildren(g, s));
    }

    @Test
    void example2() {
        int[] g = { 1, 2 };
        int[] s = { 1, 2, 3 };
        int expected = 2;
        assertEquals(expected, solution.findContentChildren(g, s));
    }
}
