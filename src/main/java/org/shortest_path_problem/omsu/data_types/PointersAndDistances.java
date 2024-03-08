package org.shortest_path_problem.omsu.data_types;

import java.util.Arrays;

public class PointersAndDistances {
    private int[] pointers;
    private double[] distances;

    public PointersAndDistances(int[] pointers, double[] distances) {
        this.pointers = pointers;
        this.distances = distances;
    }

    public PointersAndDistances(PointersAndDistances pointersAndDistances) {
        pointers = pointersAndDistances.getPointers();
        distances = pointersAndDistances.getDistances();
    }
    public int[] getPointers() {
        return pointers;
    }

    public void setPointers(int[] pointers) {
        this.pointers = pointers;
    }

    public double[] getDistances() {
        return distances;
    }

    public void setDistances(double[] distances) {
        this.distances = distances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointersAndDistances that = (PointersAndDistances) o;
        return Arrays.equals(pointers, that.pointers) && Arrays.equals(distances, that.distances);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(pointers);
        result = 31 * result + Arrays.hashCode(distances);
        return result;
    }
}
