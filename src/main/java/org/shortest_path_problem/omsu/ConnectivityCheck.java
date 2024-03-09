package org.shortest_path_problem.omsu;

public class ConnectivityCheck {
    public static boolean isGraphConnected(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        dfs(graph, 0, visited);
        for (boolean v : visited) {
            if (!v) {
                return false;
            }
        }
        return true;
    }

    private static void dfs(int[][] graph, int node, boolean[] visited) {
        visited[node] = true;
        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] != 0 && !visited[i]) {
                dfs(graph, i, visited);
            }
        }
    }
}
