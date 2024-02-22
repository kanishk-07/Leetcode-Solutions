class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] adj = new int[n + 1]; 
        for (int[] e : trust) {
            adj[e[0]]--;
            adj[e[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (adj[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}