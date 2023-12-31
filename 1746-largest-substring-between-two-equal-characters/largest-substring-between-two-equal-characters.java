class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length, ans = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(map.containsKey(arr[i])) {
                ans = Math.max(ans, i-map.get(arr[i])-1);
            } else {
                map.put(arr[i], i);
            }
        }
        return ans;
    }
}