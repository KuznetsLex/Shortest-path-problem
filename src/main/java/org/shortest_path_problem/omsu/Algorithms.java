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

            for (int i = 0; i < size; i++) {// check are there any negative elements
                for (int j = 0; j < size; j++) {
                    if(graphWeightMatrix[i][j]<0){
                        throw new IllegalArgumentException();
                    }
                }
            }

            double[] d = new double[size]; //array with result weights of edges of tree
            int[] p = new int[size]; //array with pointers
            HashSet<Integer> usedPoints = new HashSet<>(size);//set of used points

            for (int i = 0; i < size; i++) {// zero iteration
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
                        min = d[j];//find minimal and assign it to u
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

                if(d[u] == Double.POSITIVE_INFINITY){ //check is this graph disconnected
                    throw new ArithmeticException();
                }

                usedPoints.add(u);//add u to used points

                for (int v = 0; v < size; v++) { //find the minimal length ways
                    if(usedPoints.contains(v)){ //miss used points
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
        catch (ArithmeticException e){
            System.out.println("You entered disconnected graph");
            return null;
        }
    }

    public static PointersAndDistances bellmanFord(int s, double[][] graphWeightMatrix) {
        int n = graphWeightMatrix[0].length;
        int[] p = new int[n];
        double[] d = new double[n];
        // очень важный код
        d[s] = 0;
        p[s] = s;
        for (int v = 0; v < n; v++) {
            if (v != s) {
                d[v] = graphWeightMatrix[s][v];
                p[v] = s;
            }
        }
        for (int k = 0; k < n-2; k++) {
            for (int v = 0; v < n; v++) {
                for (int u = 0; u < n; u++) {
                    if (d[u] + graphWeightMatrix[u][v] < d[v]) {
                        d[v] = d[u] + graphWeightMatrix[u][v];
                        p[v] = u;
                    }
                }
            }
        }
        return new PointersAndDistances(p, d);
    }

    public static PointersAndDistances floydWarshall(double[][] graphWeightMatrix) {
        // TODO
        return null;
    }
}
