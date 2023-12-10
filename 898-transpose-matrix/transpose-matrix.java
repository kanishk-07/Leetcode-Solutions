class Solution {
    public int[][] transpose(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] ans = new int[c][r];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                ans[j][i] = mat[i][j];
            }
        }
        return ans;
    }
}