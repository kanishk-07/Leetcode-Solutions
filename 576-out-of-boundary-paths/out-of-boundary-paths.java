class Solution {

    int MOD = 1000000007;

    public int findPaths(int r, int c, int moves, int startRow, int startColumn) {
        long[][][] dp = new long[r+1][c+1][moves+1];

        for(long[][] mat: dp)
            for(long[] row: mat)
                Arrays.fill(row, -1);

        return (int)findPaths(r, c, moves, startRow, startColumn, dp);
    }

    public long findPaths(int r, int c, int moves, int startRow, int startColumn, long[][][] dp) {
        if(moves<=0)
            return 0;
        if(dp[startRow][startColumn][moves]!=-1)
            return dp[startRow][startColumn][moves];
        long ans = 0;
        ans = (ans + (isOutOfGrid(r, c, startRow+1, startColumn) ? 1 : findPaths(r, c, moves-1, startRow+1, startColumn, dp)%MOD))%MOD;
        ans = (ans + (isOutOfGrid(r, c, startRow, startColumn-1) ? 1 : findPaths(r, c, moves-1, startRow, startColumn-1, dp)%MOD))%MOD;
        ans = (ans + (isOutOfGrid(r, c, startRow-1, startColumn) ? 1 : findPaths(r, c, moves-1, startRow-1, startColumn, dp)%MOD))%MOD;
        ans = (ans + (isOutOfGrid(r, c, startRow, startColumn+1) ? 1 : findPaths(r, c, moves-1, startRow, startColumn+1, dp)%MOD))%MOD;
        return dp[startRow][startColumn][moves] = ans;
    }

    private boolean isOutOfGrid(int r, int c, int i, int j) {
        if(i<0 || j<0 || i>=r || j>=c)
            return true;
        return false;
    }
}