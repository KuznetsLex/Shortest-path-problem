package org.shortest_path_problem.omsu;

import org.junit.jupiter.api.Test;
import org.shortest_path_problem.omsu.data_types.PointersAndDistances;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void dijkstra() {
        // TODO
    }

    @Test
    void bellmanFord() {
        double[][] graphWeightMatrix = {
                {Double.POSITIVE_INFINITY, 4, 2},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, 1, Double.POSITIVE_INFINITY}
        };
        int[] p = {0, 2, 0};
        double[] d = {0, 3, 2};

        assertEquals(new PointersAndDistances(p, d), Algorithms.bellmanFord(0, graphWeightMatrix));
    }

    @Test
    void floydWarshall() {
        // TODO
    }
}