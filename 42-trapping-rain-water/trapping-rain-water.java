class Solution {
    public int trap(int[] height) {
        int n = height.length, max = height[0], ans = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        for(int i=1; i<n; i++) {
            leftMax[i] = max;
            max = Math.max(max, height[i]);
        }
        max = height[n-1];
        for(int i=n-1; i>=0; i--) {
            rightMax[i] = max;
            max = Math.max(max, height[i]);
        }
        for(int i=1; i<n-1; i++) {
            ans += Math.max(0, Math.min(leftMax[i], rightMax[i])-height[i]);
        }
        return ans;
    }
}