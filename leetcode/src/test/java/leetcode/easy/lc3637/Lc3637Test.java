package leetcode.easy.lc3637;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class Lc3637Test {

    private final Lc3637 solution = new Lc3637();

    @Test
    void isTrionicExample1() {
        int[] nums = { 1, 3, 5, 4, 2, 6 };

        assertTrue(solution.isTrionic(nums));
    }

    @Test
    void isTrionicExample2() {
        int[] nums = { 2, 1, 3 };

        assertFalse(solution.isTrionic(nums));
    }

    @Test
    void isTrionicExample3() {
        int[] nums = { 1, 1, 1, 9 };
        assertFalse(solution.isTrionic(nums));
    }

}
