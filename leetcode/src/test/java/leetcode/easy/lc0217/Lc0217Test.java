package leetcode.easy.lc0217;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class Lc0217Test {

    private final Lc0217 solution = new Lc0217();

    @Test
    void containsDuplicateExample1() {
        int[] nums = { 1, 2, 3, 1 };

        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    void containsDuplicate2() {
        int[] nums = { 1, 2, 3, 4 };

        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    void containsDuplicate3() {
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        assertTrue(solution.containsDuplicate(nums));
    }

}
