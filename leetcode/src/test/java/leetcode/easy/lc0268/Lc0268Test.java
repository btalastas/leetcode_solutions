package leetcode.easy.lc0268;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc0268Test {
    private final Lc0268 solution = new Lc0268();

    @Test
    void example1() {
        // Input: [3,0,1]
        // Output: 2
        assertEquals(2, solution.missingNumber(new int[] { 3, 0, 1 }));
    }

    @Test
    void example2() {
        // Input: [0,1]
        // Output: 2
        assertEquals(2, solution.missingNumber(new int[] { 0, 1 }));
    }

    @Test
    void example3() {
        // Input: [9,6,4,2,3,5,7,0,1]
        // Output: 8
        assertEquals(8, solution.missingNumber(
                new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }
}
