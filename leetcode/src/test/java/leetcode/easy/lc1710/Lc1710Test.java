package leetcode.easy.lc1710;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc1710Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
     * Output: 8
     * Explanation: There are:
     * - 1 box of the first type that contains 3 units.
     * - 2 boxes of the second type that contain 2 units each.
     * - 3 boxes of the third type that contain 1 unit each.
     * You can take all the boxes of the first and second types, and one box of the
     * third type.
     * The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
     * Output: 91
     * ```
     * 
     */

    private final Lc1710 solution = new Lc1710();

    @Test
    void maximumUnitsExample1() {
        int[][] boxTypes = { { 1, 3 }, { 2, 2 }, { 3, 1 } };
        int truckSize = 4;
        int expected = 8;
        assertEquals(expected, solution.maximumUnits(boxTypes, truckSize));
    }

    @Test
    void maximumUnitsExample2() {
        int[][] boxTypes = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } };
        int truckSize = 10;
        int expected = 91;
        assertEquals(expected, solution.maximumUnits(boxTypes, truckSize));
    }

}
