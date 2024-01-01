class Solution {
    public int rob(int[] nums) {
        int n = nums.length, case1 = 0, case2 = 0;
        if(n==1)
            return nums[0];
        if(n==2)
            return Math.max(nums[0], nums[1]);
        int[] dp = new int[n];
        //robbing house 1
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<n-1; i++) {
            dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
        }
        case1 = dp[n-2];
        //not robbing house 1
        dp[0] = 0;
        dp[1] = nums[1];
        for(int i=2; i<n; i++) {
            dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);
        }
        case2 = dp[n-1];
        return Math.max(case1, case2);
    }
}