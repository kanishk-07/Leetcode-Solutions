class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        permute(nums, 0, ans);
        return ans;
    }
    private void permute(int[] nums, int curr, List<List<Integer>> ans) {
        if(curr==nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int i: nums)
                list.add(i);
            ans.add(list);
            return;
        }
        for(int i=curr; i<nums.length;i++) {
            swap(nums, i, curr);
            permute(nums, curr+1, ans);
            swap(nums, i, curr);
        }
    }
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}