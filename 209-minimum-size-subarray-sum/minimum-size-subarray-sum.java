class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, currSum = 0, start = 0, ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            currSum += nums[i];
            if(currSum>=target) {
                while((currSum-nums[start])>=target) {
                    currSum -= nums[start];
                    start++;
                }
                ans = Math.min(ans, i-start+1);
            }
        }
        return ans==Integer.MAX_VALUE ? 0 : ans;
    }
}