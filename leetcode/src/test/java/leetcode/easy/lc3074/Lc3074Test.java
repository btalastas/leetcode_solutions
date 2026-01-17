package leetcode.easy.lc3074;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc3074Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: apple = [1,3,2], capacity = [4,3,1,5,2]
     * Output: 2
     * Explanation: We will use boxes with capacities 4 and 5.
     * It is possible to distribute the apples as the total capacity is greater than
     * or equal to the total number of apples.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: apple = [5,5,5], capacity = [2,4,2,7]
     * Output: 4
     * Explanation: We will need to use all the boxes.
     * ```
     */

    private final Lc3074 solution = new Lc3074();

    @Test
    void minimumBoxesExample1() {
        int[] apple = { 1, 3, 2 };
        int[] capacity = { 4, 3, 1, 5, 2 };
        int expected = 2;
        assertEquals(expected, solution.minimumBoxes(apple, capacity));
    }

    @Test
    void minimumBoxesExample2() {
        int[] apple = { 5, 5, 5 };
        int[] capacity = { 2, 4, 2, 7 };
        int expected = 4;
        assertEquals(expected, solution.minimumBoxes(apple, capacity));
    }

}
