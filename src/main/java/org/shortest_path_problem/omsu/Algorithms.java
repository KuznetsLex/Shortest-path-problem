package org.shortest_path_problem.omsu;

import org.shortest_path_problem.omsu.data_types.PointersAndDistances;

public class Algorithms {
    public static PointersAndDistances dijkstra(int s, double[][] graphWeightMatrix) {
        // TODO
        return null;
    }

    public static PointersAndDistances bellmanFord(int s, double[][] graphWeightMatrix) {
        int n = graphWeightMatrix[0].length;
        int[] p = new int[n];
        double[] d = new double[n];
        // очень важный код
        d[s] = 0;
        p[s] = s;
        for (int v = 0; v < n; v++) {
            if (v != s) {
                d[v] = graphWeightMatrix[s][v];
                p[v] = s;
            }
        }
        for (int k = 0; k < n-2; k++) {
            for (int v = 0; v < n; v++) {
                for (int u = 0; u < n; u++) {
                    if (d[u] + graphWeightMatrix[u][v] < d[v]) {
                        d[v] = d[u] + graphWeightMatrix[u][v];
                        p[v] = u;
                    }
                }
            }
        }
        return new PointersAndDistances(p, d);
    }

    public static PointersAndDistances floydWarshall(double[][] graphWeightMatrix) {
        // TODO
        return null;
    }
}
