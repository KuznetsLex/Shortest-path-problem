package org.shortest_path_problem.omsu;

import org.junit.Assert;
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
    void dijkstraSecond() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 2, 5, 7.3, 3.2, 67},
                {2, Double.POSITIVE_INFINITY, 5, 34.2, 4, 12},
                {5, 6, Double.POSITIVE_INFINITY, 6.7, 34, 21},
                {78, 24, 5.5, Double.POSITIVE_INFINITY, 34, 4},
                {4, 5, 56, 45, Double.POSITIVE_INFINITY, 34.23},
                {34, 3, 3, 43, 6.7, Double.POSITIVE_INFINITY}
        };

        int[] pointers = {1, 5, 3, 3, 5, 3};
        double[] distances = {9, 7, 5.5, 0, 10.7, 4};

        assertEquals(new PointersAndDistances(pointers, distances), Algorithms.dijkstra(3, graph));
    }

    void dijkstra() {
        double[][] graph = {{0,4,2},{Double.POSITIVE_INFINITY,0,Double.POSITIVE_INFINITY},{Double.POSITIVE_INFINITY,1,0}}; // номер 129а из сборника задач Виктора Петровича Ильева
        int s = 0;

        int[] p = {0,2,0};
        double[] d = {0,3,2};

        Assert.assertEquals(new PointersAndDistances(p,d),Algorithms.dijkstra(s,graph));
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
    void dijkstraThird() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 1, 1, 2},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 0.98, 2},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
        };

        int[] pointers = {1, 1, 1, 2};
        double[] distances = {Double.POSITIVE_INFINITY, 0, 0.98, 1.98};

        assertEquals(new PointersAndDistances(pointers, distances), Algorithms.dijkstra(1, graph));
    }

    @Test
    void dijkstraFourth() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
        };

        int[] pointers = {3, 3, 3, 3};
        double[] distances = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 0};

        assertEquals(new PointersAndDistances(pointers, distances), Algorithms.dijkstra(3, graph));
    }

    @Test
    void dijkstraFifth() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY}
        };

        int[] pointers = {0};
        double[] distances = {0};

        assertEquals(new PointersAndDistances(pointers, distances), Algorithms.dijkstra(0, graph));
    }

    @Test
    void bellmanFordFirst() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 0, 1, 2},
                {0, Double.POSITIVE_INFINITY, 2, 0},
                {1, 2, Double.POSITIVE_INFINITY, 1},
                {2, 0, 1, Double.POSITIVE_INFINITY}
        };

        int[] pointers = {1, 3, 3, 3};
        double[] distances = {0, 0, 1, 0};

        assertEquals(new PointersAndDistances(pointers, distances), Algorithms.bellmanFord(3, graph));
    }

    @Test
    void bellmanFordSecond() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 2, 5, 7.3, 3.2, 67},
                {2, Double.POSITIVE_INFINITY, 5, 34.2, 4, 12},
                {5, 6, Double.POSITIVE_INFINITY, 6.7, 34, 21},
                {78, 24, 5.5, Double.POSITIVE_INFINITY, 34, 4},
                { 4, 5, 56, 45, Double.POSITIVE_INFINITY, 34.23},
                {34, 3, 3, 43, 6.7, Double.POSITIVE_INFINITY}
        };

        int[] pointers = {1, 5, 3, 3, 5, 3};
        double[] distances = {9, 7, 5.5, 0 ,10.7, 4};

        assertEquals(new PointersAndDistances(pointers, distances), Algorithms.bellmanFord(3, graph));
    }

    @Test
    void bellmanFordThird() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 1, 1, 2},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 0.98, 2},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
        };

        int[] pointers = {1, 1, 1, 2};
        double[] distances = {Double.POSITIVE_INFINITY, 0, 0.98, 1.98};

        assertEquals(new PointersAndDistances(pointers, distances), Algorithms.bellmanFord(1, graph));
    }

    @Test
    void bellmanFordFourth() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
        };

        int[] pointers = {3, 3, 3, 3};
        double[] distances = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 0};

        assertEquals(new PointersAndDistances(pointers, distances), Algorithms.bellmanFord(3, graph));
    }

    @Test
    void bellmanFordFifth() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY}
        };

        int[] pointers = {0};
        double[] distances = {0};

        assertEquals(new PointersAndDistances(pointers, distances), Algorithms.bellmanFord(0, graph));
    }

    @Test
    void bellmanFordSixth() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, -2, 7, -1},
                {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 8, 6},
                {Double.POSITIVE_INFINITY, 3, Double.POSITIVE_INFINITY, -4},
                {5, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY}
        };

        int[] pointers = {0, 0, 1, 0};
        double[] distances = {0, -2, 6, -1};

        assertEquals(new PointersAndDistances(pointers, distances), Algorithms.bellmanFord(0, graph));
    }

    @Test
    void floydWarshallFirst() {
        double[][] graph = {
                {Double.POSITIVE_INFINITY, 0, 1, 2},
                {0, Double.POSITIVE_INFINITY, 2, 0},
                {1, 2, Double.POSITIVE_INFINITY, 1},
                {2, 0, 1, Double.POSITIVE_INFINITY}
        };

        int[] pointers = {1, 3, 3, 3};
        double[] distances = {0, 0, 1, 0};

        assertEquals(new PointersAndDistances(pointers, distances), Algorithms.floydWarshall(graph));
    }
}