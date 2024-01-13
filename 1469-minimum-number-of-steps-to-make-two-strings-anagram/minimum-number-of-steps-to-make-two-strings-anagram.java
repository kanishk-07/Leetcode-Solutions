class Solution {
    public int minSteps(String s, String t) {

        int[] countS = new int[26];
        int[] countT = new int[26];
        char[] as = s.toCharArray();
        char[] at = t.toCharArray();

        int ans = 0, n = as.length;

        for (int i=0; i<n; i++) {
            countS[as[i] - 'a']++;
            countT[at[i] - 'a']++;
        }            

        for (int i = 0; i < 26; i++)
            ans += Math.abs(countS[i] - countT[i]);

        return ans / 2;  
    }
}