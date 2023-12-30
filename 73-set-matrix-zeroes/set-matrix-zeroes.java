class Solution {
    public void setZeroes(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        boolean row = false, col = false;
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(mat[i][j]!=0)
                    continue;
                if(i==0)
                    row = true;
                if(j==0)
                    col = true;
                mat[0][j] = 0;
                mat[i][0] = 0;
            }
        }
        for(int i=r-1;i>=0;i--) {
            for(int j=c-1;j>=0;j--) {
                if((i==0 && row) || (j==0 && col))
                    mat[i][j] = 0;
                else if(i>0 && j>0 && (mat[0][j]==0 || mat[i][0]==0))
                    mat[i][j] = 0;
            }
        }
    }
}