class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[0] = true;
        for(int i=0; i<n; i++) {
            if(dp[i]) {
                int k = 0;
                while(k<=nums[i] && k+i<n) {
                    dp[i+k] = true;
                    k++;
                }
            }
        }
        return dp[n-1];
    }
}