class Solution {
    public int countOrders(int n) {
        final int MOD = 1000000007;
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
            ans %= MOD;
            ans *= (2*i) -1;
            ans %= MOD;
        }
        return (int)ans;
    }
}