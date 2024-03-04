class Solution {

    private static final int MOD = 1000000007;

    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        for(int[] row: dp)
            Arrays.fill(row, -1);
        return numRollsToTarget(n, k, target, dp);
    }

    private int numRollsToTarget(int n, int k, int target, int[][] dp) {
        if(target==0 && n==0)
            return 1;
        if(target<=0 || n<=0)
            return 0;
        if(dp[n][target]!=-1)
            return dp[n][target];
        long ans = 0;
        for(int i=1; i<=k; i++) {
            ans += (numRollsToTarget(n-1, k, target-i, dp)%MOD);
        }
        return dp[n][target] = (int)(ans%MOD);
    }
}