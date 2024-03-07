package org.shortest_path_problem.omsu;

import org.junit.jupiter.api.Test;
import org.shortest_path_problem.omsu.data_types.PointersAndDistances;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void dijkstraFirst() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 0, 1, 2},
                {0, Double.POSITIVE_INFINITY, 2, 0},
                {1, 2, Double.POSITIVE_INFINITY, 1},
                {2, 0, 1, Double.POSITIVE_INFINITY}
        };

        int[] pointers = {1, 3, 3, 3};
        double[] distances = {0, 0, 1, 0};

        assertEquals(new PointersAndDistances(pointers, distances), Algorithms.dijkstra(3, graph));
    }

    @Test
    void bellmanFord() {
        // TODO
    }

    @Test
    void floydWarshall() {
        // TODO
    }
}