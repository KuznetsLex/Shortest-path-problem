package org.shortest_path_problem.omsu.data_types;

import java.util.Arrays;

public class PointersAndDistancesMatrices {
    private int[][] pointers;
    private double[][] distances;

    public PointersAndDistancesMatrices(int[][] pointers, double[][] distances) {
        this.pointers = pointers;
        this.distances = distances;
    }

    public int[][] getPointers() {
        return pointers;
    }

    public double[][] getDistances() {
        return distances;
    }

    public void setPointers(int[][] pointers) {
        this.pointers = pointers;
    }

    public void setDistances(double[][] distances) {
        this.distances = distances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointersAndDistancesMatrices that = (PointersAndDistancesMatrices) o;
        return Arrays.deepEquals(pointers, that.pointers) && Arrays.deepEquals(distances, that.distances);
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(pointers);
        result = 31 * result + Arrays.deepHashCode(distances);
        return result;
    }
}
