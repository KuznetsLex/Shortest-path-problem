package org.shortest_path_problem.omsu;

import org.junit.jupiter.api.Test;
import org.shortest_path_problem.omsu.data_types.PathAndDistance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(new PathAndDistance(path, 0), Path.pathForDijkstra(3, 0, graph));
    }

    @Test
    void pathForDijkstraSecond() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 2, 5, 7.3, 3.2, 67},
                {2, Double.POSITIVE_INFINITY, 5, 34.2, 4, 12},
                {5, 6, Double.POSITIVE_INFINITY, 6.7, 34, 21},
                {78, 24, 5.5, Double.POSITIVE_INFINITY, 34, 4},
                {4, 5, 56, 45, Double.POSITIVE_INFINITY, 34.23},
                {34, 3, 3, 43, 6.7, Double.POSITIVE_INFINITY}
        };

        List<Integer> path = new ArrayList<>(Arrays.asList(3, 5, 1));
        assertEquals(new PathAndDistance(path, 7), Path.pathForDijkstra(3, 1, graph));
    }

    @Test
    void pathForDijkstraThird() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
        };

        List<Integer> path = new ArrayList<>(Arrays.asList(3, 2));
        assertEquals(new PathAndDistance(path, Double.POSITIVE_INFINITY), Path.pathForDijkstra(3, 2, graph));
    }

    @Test
    void pathForDijkstraFourth() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY}
        };

        List<Integer> path = new ArrayList<>(List.of(0));
        assertEquals(new PathAndDistance(path, 0), Path.pathForDijkstra(0, 0, graph));
    }

    @Test
    void pathForBellmanFordFirst() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 0, 1, 2},
                {0, Double.POSITIVE_INFINITY, 2, 0},
                {1, 2, Double.POSITIVE_INFINITY, 1},
                {2, 0, 1, Double.POSITIVE_INFINITY}
        };

        List<Integer> path = new ArrayList<>(Arrays.asList(3, 1, 0));
        assertEquals(new PathAndDistance(path, 0), Path.pathForBellmanFord(3, 0, graph));
    }

    @Test
    void pathForBellmanFordSecond() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 2, 5, 7.3, 3.2, 67},
                {2, Double.POSITIVE_INFINITY, 5, 34.2, 4, 12},
                {5, 6, Double.POSITIVE_INFINITY, 6.7, 34, 21},
                {78, 24, 5.5, Double.POSITIVE_INFINITY, 34, 4},
                {4, 5, 56, 45, Double.POSITIVE_INFINITY, 34.23},
                {34, 3, 3, 43, 6.7, Double.POSITIVE_INFINITY}
        };

        List<Integer> path = new ArrayList<>(Arrays.asList(3, 5, 1));
        assertEquals(new PathAndDistance(path, 7), Path.pathForBellmanFord(3, 1, graph));
    }

    @Test
    void pathForBellmanFordThird() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
        };

        List<Integer> path = new ArrayList<>(Arrays.asList(3, 2));
        assertEquals(new PathAndDistance(path, Double.POSITIVE_INFINITY), Path.pathForBellmanFord(3, 2, graph));
    }

    @Test
    void pathForBellmanFordFourth() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY}
        };

        List<Integer> path = new ArrayList<>(List.of(0));
        assertEquals(new PathAndDistance(path, 0), Path.pathForBellmanFord(0, 0, graph));
    }

    @Test
    void pathForBellmanFordFifth() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, -2, 7, -1},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 8, 6},
                {Double.POSITIVE_INFINITY, 3, Double.POSITIVE_INFINITY, -4},
                {5, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY}
        };

        List<Integer> path = new ArrayList<>(Arrays.asList(0, 1, 2));
        assertEquals(new PathAndDistance(path, 6), Path.pathForBellmanFord(0, 2, graph));
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

    @Test
    void pathForFloydWarshallFirst() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 0, 1, 2},
                {0, Double.POSITIVE_INFINITY, 2, 0},
                {1, 2, Double.POSITIVE_INFINITY, 1},
                {2, 0, 1, Double.POSITIVE_INFINITY}
        };

        List<Integer> path = new ArrayList<>(Arrays.asList(3, 1, 0));
        assertEquals(new PathAndDistance(path, 0), Path.pathForFloydWarshall(3, 0, graph));
    }

    @Test
    void pathForFloydWarshallSecond() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 2, 5, 7.3, 3.2, 67},
                {2, Double.POSITIVE_INFINITY, 5, 34.2, 4, 12},
                {5, 6, Double.POSITIVE_INFINITY, 6.7, 34, 21},
                {78, 24, 5.5, Double.POSITIVE_INFINITY, 34, 4},
                {4, 5, 56, 45, Double.POSITIVE_INFINITY, 34.23},
                {34, 3, 3, 43, 6.7, Double.POSITIVE_INFINITY}
        };

        List<Integer> path = new ArrayList<>(Arrays.asList(3, 5, 1));
        assertEquals(new PathAndDistance(path, 7), Path.pathForFloydWarshall(3, 1, graph));
    }

    @Test
    void pathForFloydWarshallThird() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
        };

        List<Integer> path = new ArrayList<>(Arrays.asList(3, 2));
        assertEquals(new PathAndDistance(path, Double.POSITIVE_INFINITY), Path.pathForFloydWarshall(3, 2, graph));
    }

    @Test
    void pathForFloydWarshallFourth() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY}
        };

        List<Integer> path = new ArrayList<>(List.of(0));
        assertEquals(new PathAndDistance(path, 0), Path.pathForFloydWarshall(0, 0, graph));
    }

    @Test
    void pathForFloydWarshallFifth() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, -2, 7, -1},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 8, 6},
                {Double.POSITIVE_INFINITY, 3, Double.POSITIVE_INFINITY, -4},
                {5, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY}
        };

        List<Integer> path = new ArrayList<>(Arrays.asList(0, 1, 2));
        assertEquals(new PathAndDistance(path, 6), Path.pathForFloydWarshall(0, 2, graph));
    }
}