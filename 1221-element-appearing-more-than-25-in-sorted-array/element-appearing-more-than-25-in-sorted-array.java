class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length, curr = Integer.MIN_VALUE, currCount = 0;
        for(int i=0; i<n; i++) {
            if(arr[i]==curr)
                currCount++;
            else {
                curr = arr[i];
                currCount = 1;
            }
            if(currCount >= (n/4+1))
                return arr[i];
        }
        return 0;
    }
}