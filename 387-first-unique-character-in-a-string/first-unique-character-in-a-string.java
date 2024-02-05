class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int l = s.length();
        for(int i=0;i<l;i++) {
            if(hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
            else {
                hm.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<l;i++) {
            if(hm.get(s.charAt(i))==1)
                return i;
        }
        return -1;        
    }
}