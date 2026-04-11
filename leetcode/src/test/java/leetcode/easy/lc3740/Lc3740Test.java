package leetcode.easy.lc3740;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc3740Test {
    private final Lc3740 solution = new Lc3740();

    @Test
    void minimumDistanceExample1() {
        int[] nums = { 1, 2, 1, 1, 3 };
        int expected = 6;

        assertEquals(expected, solution.minimumDistance(nums));
    }

    @Test
    void minimumDistanceExample2() {
        int[] nums = { 1, 1, 2, 3, 2, 1, 2 };
        int expected = 8;

        assertEquals(expected, solution.minimumDistance(nums));
    }
}
