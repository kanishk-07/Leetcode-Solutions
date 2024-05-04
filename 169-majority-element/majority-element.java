class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length, ele = nums[0], cnt = 1;
        for(int i=1; i<n; i++) {
            if(nums[i]==ele)
                cnt++;
            else if(cnt==0) {
                ele = nums[i];
                cnt++;
            }
            else
                cnt--;
        }
        return ele;
    }
}