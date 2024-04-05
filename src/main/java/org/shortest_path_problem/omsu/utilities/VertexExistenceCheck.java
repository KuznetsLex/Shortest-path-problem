package org.shortest_path_problem.omsu.utilities;

public class VertexExistenceCheck {
    public static boolean graphContains(double[][] graphWeightMatrix, int vertex) {
        return(graphWeightMatrix[0].length-1 >= vertex && vertex >= 0) ;
    }
}

