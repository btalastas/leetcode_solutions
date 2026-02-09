package leetcode.medium.lc1382;

import java.util.ArrayList;
import java.util.List;

public class Lc1382 {

    public void inorder(TreeNode root, List<Integer> array) {
        if (root == null)
            return;
        inorder(root.left, array);
        array.add(root.val);
        inorder(root.right, array);
    }

    public List<Integer> createSortedArray(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);

        return result;
    }

    public TreeNode insert(int[] sorted, int left, int right) {
        if (left > right)
            return null;

        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(sorted[mid]);

        root.left = insert(sorted, left, mid - 1);
        root.right = insert(sorted, mid + 1, right);

        return root;
    }

    public TreeNode buildBST(int[] arr) {
        return insert(arr, 0, arr.length - 1);
    }

    public TreeNode balanceBST(TreeNode root) {
        TreeNode balanced;
        List<Integer> sorted = new ArrayList<>();

        // perform inorder traversal to create sorted array
        sorted = createSortedArray(root);
        int[] sortedArray = new int[sorted.size()];

        for (int i = 0; i < sorted.size(); i++) {
            sortedArray[i] = sorted.get(i);
        }
        // reconstruct balanced binary search tree
        balanced = buildBST(sortedArray);
        return balanced;
    }
}
