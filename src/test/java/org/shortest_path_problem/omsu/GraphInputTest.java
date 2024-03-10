package org.shortest_path_problem.omsu;

import org.junit.jupiter.api.Test;
import org.shortest_path_problem.omsu.utilities.GraphInput;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GraphInputTest extends AlgorithmsTest {

    @Test
    void fileInput() {
        double[][] graph = {
                {0, 7, 3, 17},
                {7, 0, 1, 12},
                {8, 1, 0, 3.34},
                {8, Double.POSITIVE_INFINITY, 2, 0}
        };
        assertArrayEquals(GraphInput.fileInput(), graph);
    }
}