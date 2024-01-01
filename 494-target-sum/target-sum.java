class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return findTargetSumWays(nums, target, 0);
    }
    private int findTargetSumWays(int[] nums, int target, int curr) {
        if(curr==nums.length) {
            return target==0 ? 1 : 0;
        }
        return findTargetSumWays(nums, target+nums[curr], curr+1) +
                findTargetSumWays(nums, target-nums[curr], curr+1);
    }
}