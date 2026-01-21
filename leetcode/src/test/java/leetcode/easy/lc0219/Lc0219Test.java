package leetcode.easy.lc0219;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class Lc0219Test {

    private final Lc0219 solution = new Lc0219();

    @Test
    void containsNearbyDuplicateExample1() {
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;

        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    void containsNearbyDuplicateExample2() {
        int[] nums = { 1, 0, 1, 1 };
        int k = 1;

        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    void containsNearbyDuplicateExample3() {
        int[] nums = { 1, 2, 3, 1, 2, 3 };
        int k = 2;

        assertFalse(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    void containsNearbyDuplicateExample4() {
        int[] nums = { 99, 99 };
        int k = 2;

        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    void containsNearbyDuplicateExample5() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 1, 10 };
        int k = 15;

        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    void containsNearbyDuplicateExample6() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
        int k = 3;

        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }
}