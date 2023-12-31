class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev1 = cost[1], prev2 = cost[0], curr = prev1;
        for(int i=2; i<n; i++) {
            curr = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return Math.min(prev2, curr);
    }
}