class Solution {

    public int totalMoney(int n) {
        int week = n / 7;
        int ans = totalMoneyUtil(week);
        int day = n % 7;
        if (day == 0) {
            return ans;
        } else {
            int currWeek = week + 1;
            while (day > 0) {
                ans += currWeek;
                currWeek++;
                day--;
            }
        }
        return ans;
    }

    public int totalMoneyUtil(int week) {
        int ans = 0;
        for (int i = 0; i < week; i++) {
            ans += 28 + (i * 7);
        }
        return ans;
    }
}