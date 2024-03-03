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

class Pair {
    int in, ex;
    Pair(int i, int e) {
        in = i;
        ex = e;
    }
}

class Solution {
    public int rob(TreeNode root) {
        Pair p = robUtil(root);
        return Math.max(p.in, p.ex);
    }
    private Pair robUtil(TreeNode root) {
        if(root==null)
            return new Pair(0, 0);
        Pair left = robUtil(root.left);
        Pair right = robUtil(root.right);
        int op1 = root.val + left.ex + right.ex;
        int op2 = Math.max(left.in, left.ex) + Math.max(right.in, right.ex);
        return new Pair(op1, op2);
    }
}