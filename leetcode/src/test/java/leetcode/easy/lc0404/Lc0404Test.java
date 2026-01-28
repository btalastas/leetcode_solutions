package leetcode.easy.lc0404;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Lc0404Test {

    private final Lc0404 solution = new Lc0404();

    @Test
    void sumOfLeftLeavesExample1() {
        Integer[] array = { 3, 9, 20, null, null, 15, 7 };

        TreeNode tree = solution.buildBST(array);
        int expected = 24;
        assertEquals(expected, solution.sumOfLeftLeaves(tree));

    }

}
