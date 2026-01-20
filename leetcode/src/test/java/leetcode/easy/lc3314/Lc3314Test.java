package leetcode.easy.lc3314;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Lc3314Test {

    private final Lc3314 solution = new Lc3314();

    @Test
    void minBitwiseArrayExample1() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 5, 7));
        int[] expected = { -1, 1, 4, 3 };

        assertArrayEquals(expected, solution.minBitwiseArray(nums));
    }

    @Test
    void minBitwiseArrayExample2() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(11, 13, 31));
        int[] expected = { 9, 12, 15 };

        assertArrayEquals(expected, solution.minBitwiseArray(nums));
    }

}