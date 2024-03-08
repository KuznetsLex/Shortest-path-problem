package org.shortest_path_problem.omsu.data_types;

import java.util.Arrays;

public class PointersAndDistancesArrays {
    private int[][] pointers;
    private double[][] distances;

    public PointersAndDistancesArrays(int[][] pointers, double[][] distances) {
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
        PointersAndDistancesArrays that = (PointersAndDistancesArrays) o;
        return Arrays.equals(pointers, that.pointers) && Arrays.equals(distances, that.distances);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(pointers);
        result = 31 * result + Arrays.hashCode(distances);
        return result;
    }
}
