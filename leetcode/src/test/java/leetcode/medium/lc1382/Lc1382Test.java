package leetcode.medium.lc1382;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class Lc1382Test {

    private boolean isSameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return true;
        if (a == null || b == null)
            return false;
        if (a.val != b.val)
            return false;

        return isSameTree(a.left, b.left)
                && isSameTree(a.right, b.right);
    }

    private TreeNode insert(Integer[] node, int left, int right) {
        if (left > right)
            return null;

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(node[mid]);

        root.left = insert(node, left, mid - 1);
        root.right = insert(node, mid + 1, right);

        return root;
    }

    private TreeNode buildBST(Integer[] arr) {

        return insert(arr, 0, arr.length - 1);
    }

    private final Lc1382 solution = new Lc1382();

    @Test
    void balanceBSTExample1() {
        Integer[] array = { 1, null, 2, null, 3, null, 4, null, null };
        TreeNode root = buildBST(array);

        Integer[] arrayExpected = { 2, 1, 3, null, null, null, 4 };
        TreeNode expected = buildBST(arrayExpected);

        assertTrue(isSameTree(root, expected));

    }
}
