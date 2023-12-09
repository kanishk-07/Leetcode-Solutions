class Solution {
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length, ans = 0, curr = 0;
        while(curr<k) {
            if(isVowel(arr[curr]))
                ans++;
            curr++;
        }
        curr = ans;
        for(int i=k; i<n; i++) {
            if(isVowel(arr[i-k]))
                curr--;
            if(isVowel(arr[i]))
                curr++;
            ans = Math.max(ans, curr);
        }
        return ans;
    }
    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }
}