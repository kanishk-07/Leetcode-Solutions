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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        inorderTraversal(ans, root);
        return ans;
    }
    void inorderTraversal(List<Integer> ans, TreeNode root) {
        if(root==null)
            return;
        inorderTraversal(ans, root.left);
        ans.add(root.val);
        inorderTraversal(ans, root.right);
    }
}