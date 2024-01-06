class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int n = time.length, ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(map.containsKey((60-(time[i]%60))%60))
                ans+=map.get((60-(time[i]%60))%60);
            map.put(time[i]%60, map.getOrDefault(time[i]%60, 0)+1);
        }
        return ans;
    }
}