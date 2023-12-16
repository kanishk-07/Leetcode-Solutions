class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl!=tl)
            return false;
        int[] arr1 = new int[26];
        for(int i=0;i<sl;i++) {
            arr1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<tl;i++) {
            if(--arr1[t.charAt(i)-'a'] < 0)
                return false;
            
        }
        for(int i : arr1) {
            if(i!=0)
                return false;
        }
        return true;
    }
}