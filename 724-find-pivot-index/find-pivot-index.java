class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length, sl = 0, sr = 0;
        int[] lar = new int[n];
        int[] rar = new int[n];
        for(int i=1, j=n-2; i<n && j>=0; i++, j--) {
            sl+=nums[i-1];
            lar[i] = sl;
            sr+=nums[j+1];
            rar[j] = sr;
        }
        for(int i=0; i<n; i++) {
            if(lar[i]==rar[i])
                return i;
        }
        return -1;
    }
}