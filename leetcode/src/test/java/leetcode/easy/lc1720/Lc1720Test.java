package leetcode.easy.lc1720;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Lc1720Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: encoded = [1,2,3], first = 1
     * Output: [1,0,2,1]
     * Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR
     * 2, 2 XOR 1] = [1,2,3]
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: encoded = [6,2,7,3], first = 4
     * Output: [4,2,0,7,4]
     * ```
     */

    private final Lc1720 solution = new Lc1720();

    @Test
    void decodeExample1() {
        int[] encoded = { 1, 2, 3 };
        int first = 1;
        int[] expected = { 1, 0, 2, 1 };
        assertArrayEquals(expected, solution.decode(encoded, first));
    }

    @Test
    void decodeExample2() {
        int[] encoded = { 6, 2, 7, 3 };
        int first = 4;
        int[] expected = { 4, 2, 0, 7, 4 };
        assertArrayEquals(expected, solution.decode(encoded, first));
    }
}
