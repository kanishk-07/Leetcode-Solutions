class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length, index = 0;
        for(int i=0; i<n; i++) {
            if(nums[i]!=0) {
                int tmp = nums[index];
                nums[index] = nums[i];
                nums[i] = tmp;
                index++;
            }
        }
    }
}