class Solution {
    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int ans = 0, n = arr.length;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i=0; i<n; i++) {
            char ch = arr[i];
            if(i<n-1 && map.get(arr[i+1])>map.get(ch)) {
                ans-=map.get(ch);
            } else {
                ans+=map.get(ch);
            }
        }
        return ans;
    }
}