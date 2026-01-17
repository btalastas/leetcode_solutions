package leetcode.easy.lc0605;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class Lc0605Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: flowerbed = [1,0,0,0,1], n = 1
     * Output: true
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: flowerbed = [1,0,0,0,1], n = 2
     * Output: false
     * ```
     */

    private final Lc0605 solution = new Lc0605();

    @Test
    void example1() {
        int[] flowerbed = { 1, 0, 0, 0, 1 };
        int n = 1;
        assertTrue(solution.canPlaceFlowers(flowerbed, n));
    }

    @Test
    void example2() {
        int[] flowerbed = { 1, 0, 0, 0, 1 };
        int n = 2;
        assertFalse(solution.canPlaceFlowers(flowerbed, n));
    }
}
