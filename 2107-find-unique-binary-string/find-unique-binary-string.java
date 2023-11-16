class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        int n = nums.length;
        for(int i=0;i<n;i++) {
            ans.append(nums[i].charAt(i)=='0'?'1':'0');
        }
        return ans.toString();
    }
}
/*
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int n = nums.length;
        for(int i=0;i<n;i++)
            hs.add(Integer.parseInt(nums[i],2));
        String ans = "";
        int upperBound = (int)Math.pow(2,n)-1;
        for(int i=0;i<=upperBound;i++) {
            if(!hs.contains(i)) {
                ans = Integer.toBinaryString(i);
                break;
            }
        }
        while(ans.length()<n)
            ans = "0"+ans;
        return ans;
    }
}
*/