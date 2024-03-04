package org.shortest_path_problem.omsu.data_types;

public class PointersAndDistances {
    private int[] pointers;
    private int[] distances;

    public PointersAndDistances(int[] pointers, int[] distances) {
        this.pointers = pointers;
        this.distances = distances;
    }

    public int[] getPointers() {
        return pointers;
    }

    public void setPointers(int[] pointers) {
        this.pointers = pointers;
    }

    public int[] getDistances() {
        return distances;
    }

    public void setDistances(int[] distances) {
        this.distances = distances;
    }
}
