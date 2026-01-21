package leetcode.easy.lc0171;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Lc0171Test {
    private final Lc0171 solution = new Lc0171();

    @Test
    void titleToNumberExample1() {
        String title = "A";
        int expected = 1;

        assertEquals(expected, solution.titleToNumber(title));
    }

    @Test
    void titleToNumberExample2() {
        String title = "AB";
        int expected = 28;

        assertEquals(expected, solution.titleToNumber(title));
    }

    @Test
    void titleToNumberExample3() {
        String title = "ZY";
        int expected = 701;

        assertEquals(expected, solution.titleToNumber(title));
    }
}
