package org.shortest_path_problem.omsu;

import org.shortest_path_problem.omsu.data_types.PathAndDistance;
import org.shortest_path_problem.omsu.data_types.PointersAndDistances;

import java.util.ArrayList;
import java.util.List;

import static org.shortest_path_problem.omsu.Algorithms.dijkstra;

public class Path {
    public static PathAndDistance pathForDijkstra(int s, int t, double[][] graphWeightMatrix) {
        List<Integer> pathList = new ArrayList<>();
        PointersAndDistances pointersAndDistances = new PointersAndDistances(dijkstra(s, graphWeightMatrix));
        int v = t;
        pathList.add(v);
        while(v!=s) {
            int u = pointersAndDistances.getPointers()[v];
            pathList.addFirst(u);
            v = u;
        }
        double distance = pointersAndDistances.getDistances()[t];
        return new PathAndDistance(pathList, distance);
    }
}
