class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int minTime = Math.max(Math.abs(fx-sx), Math.abs(fy-sy));
        if(minTime==0 && t==1)
            return false;
        return minTime<=t;
    }
}