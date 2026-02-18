# Leetcode cheatsheet

## Binary Tree Traversals

```java
//preorder - creating a copy of tree, prefix notation
void preorder(TreeNode root) {
    if (root == null) return;
    System.out.print(root.val + " ");
    preorder(root.left);
    preorder(root.right);
}
//inorder - retrieve data in sorted order
void inorder(TreeNode root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.val + " ");
    inorder(root.right);
}
//postorder - deleting tree or postfix expressions
void postorder(TreeNode root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.val + " ");
}
```

## Building BST

```java
public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }
public static TreeNode buildBST(int[] arr) {
        TreeNode root = null;
        for (int val : arr) {
            root = insert(root, val);
        }
        return root;
    }
```

## Building BST from sorted array

```java
public TreeNode sortedArrayToBST(int[] nums) {
    return build(nums, 0, nums.length - 1);
}

private TreeNode build(int[] nums, int left, int right) {
    if (left > right) return null;

    int mid = left + (right - left) / 2;
    TreeNode root = new TreeNode(nums[mid]);

    root.left = build(nums, left, mid - 1);
    root.right = build(nums, mid + 1, right);

    return root;
}
```

## Building level based tree through array

left child - `2 * index + 1`
right child - `2 * index + 2`

```java
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
```

## Comparing Trees for equality

```java
private boolean isSameTree(TreeNode a, TreeNode b) {
    if (a == null && b == null) return true;
    if (a == null || b == null) return false;
    if (a.val != b.val) return false;

    return isSameTree(a.left, b.left)
        && isSameTree(a.right, b.right);
}
```

## Using Array to store values for a-z characters

```java
int[] count = new int[26]; // space for each character
String vowels = "aeiou";
vowel.indexOf(ch) != -1 // check if current character is not a vowel
count[index - 'a'] // determine what index in array for current character in string
```
