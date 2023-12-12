/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int longestZigZag(TreeNode root) {
        if(root==null)
            return 0;
        int[] ans = {0};
        longestZigZag(root.left, 0, 1, ans);
        longestZigZag(root.right, 1, 1, ans);
        return ans[0];
    }
    private void longestZigZag(TreeNode root, int dir, int depth, int[] ans) {
        if(root==null)
            return;
        ans[0] = Math.max(ans[0], depth);
        longestZigZag(root.left, 0, dir==0 ? 1 : 1+depth, ans);
        longestZigZag(root.right, 1, dir==0 ? 1+depth : 1, ans);
    }
}