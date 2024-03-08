package org.shortest_path_problem.omsu;

import org.shortest_path_problem.omsu.data_types.PointersAndDistances;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Algorithms {
    public static PointersAndDistances dijkstra(int s, double[][] graphWeightMatrix) {
        try {
            int size = graphWeightMatrix[0].length;

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if(graphWeightMatrix[i][j]<0){
                        throw new IllegalArgumentException();
                    }
                }
            }

            double[] d = new double[size];
            int[] p = new int[size];
            HashSet<Integer> usedPoints = new HashSet<>(size);

            for (int i = 0; i < size; i++) {
                d[i] = graphWeightMatrix[s][i];
                p[i] = s;
            }
            d[s]=0;
            usedPoints.add(s);

            int u = 0;
            for (int i = 0; i < size - 1; i++) {
                double min = 0;
                for (int j = 0; j < size; j++) {
                    if(!usedPoints.contains(j)){
                        min = d[j];
                        u=j;
                    }
                }
                for (int j = 0; j < size; j++) {
                    if(usedPoints.contains(j)){
                        continue;
                    }
                    else if (d[j] < min) {
                        min = d[j];
                        u = j;
                    }
                }

                usedPoints.add(u);

                for (int v = 0; v < size; v++) {
                    if(usedPoints.contains(v)){
                        continue;
                    }
                    else if(d[u]+graphWeightMatrix[u][v]<d[v]){
                        d[v] = d[u]+graphWeightMatrix[u][v];
                        p[v] = u;
                    }
                }
            }

            return new PointersAndDistances(p,d);
        }
        catch (IllegalArgumentException e){
            System.out.println("You entered matrix with negative elements");
            return null;
        }
    }

    public static PointersAndDistances bellmanFord(int s, double[][] graphWeightMatrix) {
        // TODO
        return null;
    }

    public static PointersAndDistances floydWarshall(double[][] graphWeightMatrix) {
        // TODO
        return null;
    }
}
