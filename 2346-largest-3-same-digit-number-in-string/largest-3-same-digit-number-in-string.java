class Solution {
    public String largestGoodInteger(String num) {
        int ans = -1;
        char[] arr = num.toCharArray();
        int n = arr.length;
        for(int i=0; i<n-2; i++) {
            if(arr[i]==arr[i+1] && arr[i]==arr[i+2]) {
                int curr = Character.getNumericValue(arr[i])*100 +
                            Character.getNumericValue(arr[i+1])*10 +
                            Character.getNumericValue(arr[i+2]);
                if(ans==-1 || ans<curr) {
                    ans = curr;
                }
            }
        }
        return ans==-1 ? "" : ans==0 ? "000" : String.valueOf(ans);
    }
}