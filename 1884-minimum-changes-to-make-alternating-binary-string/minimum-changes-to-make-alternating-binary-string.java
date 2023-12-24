class Solution {
    public int minOperations(String s) {
        char[] arr = s.toCharArray();
        char ch1 = arr[0], ch2 = ch1=='1'?'0':'1';
        int n = arr.length, ans1 = 0, ans2 = 1;;
        for(int i=1; i<n; i++) {
            if(arr[i]==ch1) {
                ans1++;
            }
            ch1=ch1=='1'?'0':'1';
            if(arr[i]==ch2) {
                ans2++;
            }
            ch2=ch2=='1'?'0':'1';
        }
        return Math.min(ans1, ans2);
    }
}