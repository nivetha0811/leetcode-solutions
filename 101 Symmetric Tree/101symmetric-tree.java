class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        // 1. If both are null, they are symmetric
        if (left == null && right == null) {
            return true;
        }

        // 2. If only one is null, or values don't match, they are NOT symmetric
        if (left == null || right == null || left.val != right.val) {
            return false;
        }

        // 3. Recurse: Compare outer children and inner children
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}