class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length, low = 0, high = n-1;
        if(n==1)
            return nums[0];
        while(low<=high) {
            int mid = (low+high)/2;
            if(mid==0 && nums[mid+1]!=nums[mid])
                return nums[0];
            else if(mid==n-1 && nums[mid-1]!=nums[mid])
                return nums[mid];
            else if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) {
                return nums[mid];
            }
            else if(mid%2==0) {
                if(nums[mid-1]==nums[mid])
                    high = mid-1;
                else
                    low = mid+1;
            } else {
                if(nums[mid+1]==nums[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
        }
        return 0;
    }
}