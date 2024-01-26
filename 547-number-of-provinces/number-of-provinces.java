class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, ans = 0;
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                ans++;
                dfs(isConnected, visited, i);
            }
        }
        return ans;
    }
    private void dfs(int[][] isConnected, boolean[] visited, int node) {
        visited[node] = true;
        for(int i=0; i<visited.length; i++) {
            if(isConnected[node][i]==1 && !visited[i])
                dfs(isConnected, visited, i);
        }
    }
}