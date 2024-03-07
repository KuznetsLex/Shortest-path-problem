package org.shortest_path_problem.omsu;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.shortest_path_problem.omsu.data_types.PointersAndDistances;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void dijkstra() {
        double[][] graph = {{0,4,2},{Double.POSITIVE_INFINITY,0,Double.POSITIVE_INFINITY},{Double.POSITIVE_INFINITY,1,0}}; // номер 129а из сборника задач Виктора Петровича Ильева
        int s = 0;

        int[] p = {0,2,0};
        double[] d = {0,3,2};

        Assert.assertEquals(new PointersAndDistances(p,d),Algorithms.dijkstra(s,graph));
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