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
    public int kthSmallest(TreeNode root, int k) {
        int[] ans = {root.val};
        kthSmallest(root, k, ans, new int[]{0});
        return ans[0];
    }
    private void kthSmallest(TreeNode root, int k, int[] ans, int[] curr) {
        if(root==null)
            return;
        kthSmallest(root.left, k, ans, curr);
        curr[0]++;
        if(curr[0]==k) {
            ans[0] = root.val;
            return;
        }
        kthSmallest(root.right, k, ans, curr);
    }
}