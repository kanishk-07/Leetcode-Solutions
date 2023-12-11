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
    public int goodNodes(TreeNode root) {
        if(root==null)
            return 0;
        int max = root.val, ans[] = {0};
        goodNodes(root, ans, max);
        return ans[0];
    }
    void goodNodes(TreeNode root, int[] ans, int max) {
        if(root==null)
            return;
        if(root.val>=max)
            ans[0]++;
        max = Math.max(max, root.val);
        goodNodes(root.left, ans, max);
        goodNodes(root.right, ans, max);
    }
}