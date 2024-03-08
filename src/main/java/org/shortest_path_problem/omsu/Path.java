package org.shortest_path_problem.omsu;

import org.shortest_path_problem.omsu.data_types.PathAndDistance;
import org.shortest_path_problem.omsu.data_types.PointersAndDistances;

import java.util.ArrayList;
import java.util.List;

import static org.shortest_path_problem.omsu.Algorithms.dijkstra;

public class Path {
    public static PathAndDistance pathForDijkstra(int s, int t, double[][] graphWeightMatrix) {
        List<Integer> pathList = new ArrayList<>();
        int[] p = Algorithms.dijkstra(s, graphWeightMatrix).getPointers();
        double[] d = Algorithms.dijkstra(s, graphWeightMatrix).getDistances();
        int v = t;
        pathList.add(v);
        while(v!=s) {
            int u = p[v];
            pathList.addFirst(u);
            v = u;
        }
        double distance = d[t];
        return new PathAndDistance(pathList, distance);
    }
}
