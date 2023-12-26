class Solution {

    private int MOD = 1000000007;

    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        for(int[] row: dp)
            Arrays.fill(row, -1);
        numRollsToTarget(n, k, target, dp);
        return dp[n][target];
    }

    private int numRollsToTarget(int dice, int faces, int target, int[][] dp) {
        if(target<0 || (target==0 && dice!=0))
            return 0;
        if(dice==0)
            return target==0 ? 1 : 0;
        if(dp[dice][target]!=-1)
            return dp[dice][target];
        int ans = 0;
        for(int i=1; i<=faces; i++) {
            ans = (ans + numRollsToTarget(dice-1, faces, target-i, dp)%MOD)%MOD;
        }
        return dp[dice][target] = ans;
    }
}