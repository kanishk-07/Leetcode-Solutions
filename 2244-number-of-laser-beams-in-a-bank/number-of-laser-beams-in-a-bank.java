class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0, n = bank.length;
        int devicePrev = 0, deviceCurr = 0;

        for(char ch: bank[0].toCharArray())
            if(ch=='1')
                devicePrev++;

        for(int i=1; i<n; i++) {
            deviceCurr = 0;
            for(char ch: bank[i].toCharArray())
                if(ch=='1')
                    deviceCurr++;
            if(deviceCurr>0) {
                ans += devicePrev*deviceCurr;
                devicePrev = deviceCurr;
            }
        }
        return ans;
    }
}