class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1-k);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }
    private void reverse(int[] nums, int start, int end) {
        int n = end-start+1;
        for(int i=0; i<n/2; i++) {
            int tmp = nums[start+i];
            nums[start+i] = nums[start+(n-i-1)];
            nums[start+(n-i-1)] = tmp;
        }
    }
}