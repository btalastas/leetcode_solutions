package leetcode.easy.lc0404;

public class Lc0404 {

    public TreeNode insert(Integer[] node, int index) {
        if (index >= node.length || node[index] == null) {
            return null;
        }

        TreeNode root = new TreeNode(node[index]);
        root.left = insert(node, 2 * index + 1);
        root.right = insert(node, 2 * index + 2);
        return root;
    }

    public TreeNode buildBST(Integer[] arr) {

        return insert(arr, 0);
    }

    private int getSum(TreeNode root) {
        int sum = 0;

        if (root == null) {
            return 0;
        }

        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        sum += getSum(root.left);
        sum += getSum(root.right);

        return sum;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return getSum(root);
    }

}
