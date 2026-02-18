package leetcode.easy.lc0693;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class Lc0693Test {
    private final Lc0693 solution = new Lc0693();

    @Test
    void hasAlternatingBitsExample1() {
        int n = 5;

        assertTrue(solution.hasAlternatingBits(n));
    }

    @Test
    void hasAlternatingBitsExample2() {
        int n = 7;

        assertFalse(solution.hasAlternatingBits(n));
    }

    @Test
    void hasAlternatingBitsExample3() {
        int n = 11;

        assertFalse(solution.hasAlternatingBits(n));
    }

    @Test
    void hasAlternatingBitsExample4() {
        int n = 10;

        assertTrue(solution.hasAlternatingBits(n));
    }
}
