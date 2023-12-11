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
        public int pathSum(TreeNode root, int sum) {
        HashMap<Long, Long> preSum = new HashMap<Long, Long>();
        preSum.put((long)0, (long)1);
        return (int)helper(root, 0, (long)sum, preSum);
    }
    public long helper(TreeNode root, long currSum, long target, HashMap<Long, Long> preSum) {
        if (root == null) {
            return 0;
        }
        
        currSum += root.val;
        long res = preSum.getOrDefault(currSum - target, (long)0);
        preSum.put(currSum, preSum.getOrDefault(currSum, (long)0) + (long)1);
        
        res += helper(root.left, currSum, target, preSum) + helper(root.right, currSum, target, preSum);
        preSum.put(currSum, preSum.get(currSum) - 1);
        return res;
    }
}