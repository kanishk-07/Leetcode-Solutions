class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = 0, sell = 0, ans = 0;
        for(int i=0; i<n; i++) {
            if(i<n-1 && prices[i]<prices[i+1])
                buy+=prices[i];
            if(i>0 && prices[i]>prices[i-1])
                sell+=prices[i];
        }
        return Math.max(0, sell-buy);
    }
}