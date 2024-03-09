package org.shortest_path_problem.omsu;

import org.shortest_path_problem.omsu.data_types.PointersAndDistances;
import org.shortest_path_problem.omsu.data_types.PointersAndDistancesMatrices;

public class Algorithms {
    public static PointersAndDistances dijkstra(int s, double[][] graphWeightMatrix) {
        // TODO
        return null;
    }

    public static PointersAndDistances bellmanFord(int s, double[][] graphWeightMatrix) {
        // TODO
        return null;
    }

    public static PointersAndDistancesMatrices floydWarshall(double[][] graphWeightMatrix) {
            double[][] matrixWeight= new double [graphWeightMatrix.length][graphWeightMatrix[0].length];
            int[][] matrixIndex= new int [matrixWeight.length][matrixWeight[0].length];
            for (int i = 0; i < matrixWeight.length; i++){
                for (int j = 0; j < matrixWeight[0].length; j++){
                    matrixWeight[i][j] = graphWeightMatrix[i][j];
                    matrixIndex[i][j] = -1;
                }
            }

            for (int i = 0; i < matrixWeight.length; i++){
                matrixWeight[i][i] = 0;
            }

            for (int k = 0; k < matrixWeight.length; k++){
                for (int i = 0; i < matrixWeight.length; i++){
                    for (int j = 0; j < matrixWeight.length; j++) {
                        if (matrixWeight[i][j] > matrixWeight[i][k] + matrixWeight[k][j]){
                            matrixWeight[i][j] = matrixWeight[i][k] + matrixWeight[k][j];
                            if(matrixIndex[k][j] == -1) matrixIndex[i][j] = k;
                            else matrixIndex[i][j] = matrixIndex[k][j];
                        }
                    }}}
            return new PointersAndDistancesMatrices(matrixIndex, matrixWeight);
    }
}
