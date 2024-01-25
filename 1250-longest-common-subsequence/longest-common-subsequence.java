class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        s1 = "#" + s1;
        s2 = "#" + s2;
        int n1 = s1.length();
        int n2 = s2.length();
        int[][] dp = new int[n1][n2];
        
        for(int i=0;i<n1;i++)
            dp[i][0] = 0;
        for(int i=0;i<n2;i++)
            dp[0][i] = 0;
        
        for(int i=1;i<n1;i++) {
            for(int j=1;j<n2;j++) {
                if(s1.charAt(i)==s2.charAt(j))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n1-1][n2-1];
    }
}