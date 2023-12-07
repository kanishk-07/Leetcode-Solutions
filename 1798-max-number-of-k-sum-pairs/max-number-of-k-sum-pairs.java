class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length, l = 0, r = n-1, ans = 0;
        Arrays.sort(nums);
        while(l<r) {
            while(l<r && nums[l]+nums[r]<k)
                l++;
            while(l<r && nums[l]+nums[r]>k)
                r--;
            while(l<r && nums[l]+nums[r]==k) {
                ans++;
                l++;
                r--;
            }
        }
        return ans;
    }
}