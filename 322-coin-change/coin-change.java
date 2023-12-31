class Solution {
    public int coinChange(int[] coins, int amt) {
        int n = coins.length;
        Arrays.sort(coins);
        int[][] dp = new int[n][amt+1];
        for(int i=0; i<n; i++) {
            for(int j=1; j<=amt; j++) {
                if(i==0) {
                    dp[i][j] = j%coins[0]==0 ? j/coins[0] : 1000000;
                } else if (j<coins[i]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j], 1+dp[i][j-coins[i]]);
                }
            }
        }
        return dp[n-1][amt] >= 1000000 ? -1 : dp[n-1][amt];
    }
}