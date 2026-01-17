package leetcode.easy.lc2678;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Lc2678Test {

    /**
     * Example 1:
     * 
     * ```bash
     * Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
     * Output: 2
     * Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40.
     * Thus, there are 2 people who are over 60 years old.
     * ```
     * 
     * Example 2:
     * 
     * ```bash
     * Input: details = ["1313579440F2036","2921522980M5644"]
     * Output: 0
     * Explanation: None of the passengers are older than 60.
     * ```
     */

    private final Lc2678 solution = new Lc2678();

    @Test
    void countSeniorsExample1() {
        String[] details = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };
        int expected = 2;
        assertEquals(expected, solution.countSeniors(details));
    }

    @Test
    void countSeniorsExample2() {
        String[] details = { "1313579440F2036", "2921522980M5644" };
        int expected = 0;
        assertEquals(expected, solution.countSeniors(details));
    }
}
