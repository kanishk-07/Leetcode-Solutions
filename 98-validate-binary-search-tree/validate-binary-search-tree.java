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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean isValidBST(TreeNode root, long lowerBound, long higherBound) {
        if(root==null)
            return true;
        if(root.val<=lowerBound || root.val>=higherBound)
            return false;
        boolean left = isValidBST(root.left, lowerBound, root.val);
        boolean right = isValidBST(root.right, root.val, higherBound);
        return (left && right);
    }
}