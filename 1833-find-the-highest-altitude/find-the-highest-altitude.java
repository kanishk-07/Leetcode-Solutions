class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0, ans = 0;
        for(int i: gain) {
            sum += i;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}