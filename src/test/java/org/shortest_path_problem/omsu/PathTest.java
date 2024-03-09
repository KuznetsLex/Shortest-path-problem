package org.shortest_path_problem.omsu;

import org.junit.jupiter.api.Test;
import org.shortest_path_problem.omsu.data_types.PathAndDistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathTest {

    @Test
    void pathForDijkstra() {
        // TODO
    }

    @Test
    void pathForBellmanFord() {
        // TODO
    }

    @Test
    void pathForFloydWarshall() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 0, 1, 2},
                {0, Double.POSITIVE_INFINITY, 2, 0},
                {1, 2, Double.POSITIVE_INFINITY, 1},
                {2, 0, 1, Double.POSITIVE_INFINITY}
        };

        List<Integer> path = new ArrayList<>(Arrays.asList(3, 1, 0));
        assertEquals(new PathAndDistance(path, 0), Path.pathForFloydWarshall(3, 0, graph));
    }
}