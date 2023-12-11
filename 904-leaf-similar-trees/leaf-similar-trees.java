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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String s1 = getString(root1);
        String s2 = getString(root2);
        //System.out.println(s1 +" "+ s2);
        return s1.equals(s2);
    }
    String getString(TreeNode root) {
        if(root==null)
            return "";
        String left = getString(root.left);
        String right = getString(root.right);
        String curr = (root.left==null && root.right==null) ? String.valueOf(root.val) + "%" : "";
        return left + curr + right;
    }
}