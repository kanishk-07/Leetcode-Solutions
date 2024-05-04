class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int r = mat.length, c = mat[0].length;
        int rowFound = -1, l = 0, h = r-1;
        while(l<=h) {
            int m = (l+h)/2;
            if(mat[m][0]==x || mat[m][c-1]==x)
                return true;
            if(x>mat[m][0] && x<mat[m][c-1]) {
                rowFound = m;
                break;
            }
            if(x>mat[m][0])
                l = m+1;
            else
                h = m-1;
        }
        System.out.println(rowFound);
        if(rowFound==-1) return false;
        l = 0;
        h = c-1;
        while(l<=h) {
            int m = (l+h)/2;
            if(mat[rowFound][m]==x)
                return true;
            if(x>mat[rowFound][m])
                l = m+1;
            else
                h = m-1;
        }
        return false;
    }
}