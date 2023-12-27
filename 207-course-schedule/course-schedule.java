class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[numCourses];
        boolean[] dfsVisited = new boolean[numCourses];
        HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
        for(int i=0; i<numCourses; i++)
            graph.put(i, new HashSet<Integer>());
        for(int[] edge: prerequisites)
            graph.get(edge[0]).add(edge[1]);
        for(int i=0; i<numCourses; i++) {
            if(!visited[i] && hasCycle(graph, visited, i, dfsVisited))
                return false;
        }
        return true;
    }

    private boolean hasCycle(HashMap<Integer, HashSet<Integer>> graph, boolean[] visited, int node, boolean[] dfsVisited) {
        visited[node] = true;
        dfsVisited[node] = true;
        for(int i: graph.get(node)) {
            if(visited[i] && dfsVisited[i])
                return true;
            if(!visited[i] && hasCycle(graph, visited, i, dfsVisited))
                return true;
        }
        dfsVisited[node] = false;
        return false;
    }
}