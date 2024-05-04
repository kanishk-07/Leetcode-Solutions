class Solution {
    public double myPow(double x, int n) { // 27^-3
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n==-1)
            return 1/x;
        double halfPow = myPow(x, n/2);
        if(n%2==0) {
            return halfPow*halfPow;
        }
        return n>0 ? halfPow*halfPow*x : halfPow*halfPow*(1/x);
    }
}