class Solution {
    public int minDeletions(String s) {
        char[] str = s.toCharArray();
        int[] freq = new int[26];
        for(int i=0;i<str.length;i++) {
            freq[str[i]-'a']++;
        }
        Arrays.sort(freq);
        int maxFreqAvailable = str.length, ans = 0;
        for(int i=25; i>=0 && freq[i]>0 ;i--) {
            if(freq[i]>maxFreqAvailable) {
                ans = ans + freq[i]-maxFreqAvailable;
                freq[i] = maxFreqAvailable;
            }
            maxFreqAvailable = Math.max(0, freq[i]-1);
        }
        return ans;
    }
}