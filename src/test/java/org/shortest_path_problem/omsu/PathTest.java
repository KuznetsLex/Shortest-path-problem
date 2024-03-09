package org.shortest_path_problem.omsu;

import org.junit.jupiter.api.Test;
import org.shortest_path_problem.omsu.data_types.PathAndDistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.shortest_path_problem.omsu.Path.path;

class PathTest {

    @Test
    void pathForDijkstraFirst() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 0, 1, 2},
                {0, Double.POSITIVE_INFINITY, 2, 0},
                {1, 2, Double.POSITIVE_INFINITY, 1},
                {2, 0, 1, Double.POSITIVE_INFINITY}
        };

        List<Integer> path = new ArrayList<>(Arrays.asList(3, 1, 0));
        assertEquals(new PathAndDistance(path, 0), path(3, 0, graph));
    }

    @Test
    void pathForBellmanFord() {
        // TODO
    }

    @Test
    void pathForFloydWarshall() {
        // TODO
    }
}