class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        permute(nums, ans, 0);
        return ans;
    }

    private void permute(int[] nums, ArrayList<List<Integer>> ans, int curr) {
        if(curr==nums.length) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i=0; i<nums.length; i++)
                list.add(nums[i]);
            ans.add(list);
            return;
        }
        for(int i=curr; i<nums.length; i++) {
            swap(nums, curr, i);
            permute(nums, ans, curr+1);
            swap(nums, curr, i);
        }
        
    }

    private void swap(int[]arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}