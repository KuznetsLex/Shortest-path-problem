package org.shortest_path_problem.omsu;

import org.junit.jupiter.api.Test;
import org.shortest_path_problem.omsu.data_types.PointersAndDistances;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlgorithmsTest {

    @Test
    void dijkstra() {
        double[][] graph = new double[4][4];
        graph[0][0] = Double.POSITIVE_INFINITY;
        graph[1][1] = Double.POSITIVE_INFINITY;
        graph[2][2] = Double.POSITIVE_INFINITY;
        graph[3][3] = Double.POSITIVE_INFINITY;
        graph[0][1] = 0;
        graph[0][2] = 1;
        graph[0][3] = 2;
        graph[1][0] = 0;
        graph[1][2] = 2;
        graph[1][3] = 0;
        graph[2][0] = 1;
        graph[2][1] = 2;
        graph[2][3] = 1;
        graph[3][0] = 2;
        graph[3][1] = 0;
        graph[3][2] = 1;

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