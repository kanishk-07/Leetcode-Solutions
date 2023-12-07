class Solution {
    public int maxArea(int[] height) {
        int ans = 0, n = height.length, l = 0, r = n-1;
        while(l<r) {
            int water = Math.min(height[l], height[r])*(r-l);
            ans = Math.max(ans, water);
            if(height[l]>height[r])
                r--;
            else if(height[l]<height[r])
                l++;
            else {
                l++;
                r--;
            }
        }
        return ans;
    }
}