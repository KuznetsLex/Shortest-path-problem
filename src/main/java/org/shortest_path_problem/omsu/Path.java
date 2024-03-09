package org.shortest_path_problem.omsu;

import org.shortest_path_problem.omsu.data_types.PathAndDistance;
import org.shortest_path_problem.omsu.data_types.PointersAndDistancesMatrices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Path {

    public static PathAndDistance PathForFloydWarshall(int s, int t, double[][] graphWeightMatrix) {
        PointersAndDistancesMatrices matrices = Algorithms.floydWarshall(graphWeightMatrix);
        List<Integer> path = new ArrayList<>(graphWeightMatrix[0].length);
        double distance = matrices.getDistances()[s][t];

        path.add(t);

        while(s != t) {
            t = matrices.getPointers()[s][t];
            path.add(t);
        }
        Collections.reverse(path);

        return new PathAndDistance(path, distance);
    }
}
