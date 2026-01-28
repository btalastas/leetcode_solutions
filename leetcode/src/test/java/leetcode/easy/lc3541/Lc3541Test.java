package leetcode.easy.lc3541;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Lc3541Test {

    private final Lc3541 solution = new Lc3541();

    @Test
    void maxFreqSumExample1() {
        String s = "successes";
        int expected = 6;

        assertEquals(expected, solution.maxFreqSum(s));
    }

    @Test
    void maxFreqSumExample2() {
        String s = "aeiaeia";
        int expected = 3;

        assertEquals(expected, solution.maxFreqSum(s));
    }

}
