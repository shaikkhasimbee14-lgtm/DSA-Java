
class Solution {
    int k, ans;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        inorder(root);
        return ans;
    }

    void inorder(TreeNode root) {
        if (root == null || k == 0) return;
        inorder(root.left);
        if (k == 0) return;
        if (--k == 0) ans = root.val;
        inorder(root.right);
    }
}
