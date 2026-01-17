package leetcode.easy.lc2078;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc2078Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: colors = [1,1,1,6,1,1,1]
     * Output: 3
     * Explanation: In the above image, color 1 is blue, and color 6 is red.
     * The furthest two houses with different colors are house 0 and house 3.
     * House 0 has color 1, and house 3 has color 6. The distance between them is
     * abs(0 - 3) = 3.
     * Note that houses 3 and 6 can also produce the optimal answer.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: colors = [1,8,3,8,3]
     * Output: 4
     * Explanation: In the above image, color 1 is blue, color 8 is yellow, and
     * color 3 is green.
     * The furthest two houses with different colors are house 0 and house 4.
     * House 0 has color 1, and house 4 has color 3. The distance between them is
     * abs(0 - 4) = 4.
     * ```
     * 
     * Example 3:
     * 
     * ```bash
     * Input: colors = [0,1]
     * Output: 1
     * Explanation: The furthest two houses with different colors are house 0 and
     * house 1.
     * House 0 has color 0, and house 1 has color 1. The distance between them is
     * abs(0 - 1) = 1.
     * ```
     */

    private final Lc2078 solution = new Lc2078();

    @Test
    void maxDistanceExample1() {
        int[] colors = { 1, 1, 1, 6, 1, 1, 1 };
        int expected = 3;
        assertEquals(expected, solution.maxDistance(colors));
    }

    @Test
    void maxDistanceExample2() {
        int[] colors = { 1, 8, 3, 8, 3 };
        int expected = 4;
        assertEquals(expected, solution.maxDistance(colors));
    }

}
